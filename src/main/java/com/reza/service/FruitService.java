package com.reza.service;

import com.reza.model.Fruit;
import org.springframework.cache.Cache;
import org.springframework.stereotype.Service;
import reactor.cache.CacheMono;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Signal;

import java.util.Optional;

@Service
public class FruitService {

    private final Cache cache;

    public FruitService(Cache cache) {
        this.cache = cache;
    }

    public Mono<Fruit> findById(final Long id) {
        return CacheMono.lookup(key -> Mono.justOrEmpty(cache.get(id, Fruit.class))
                .map(Signal::next), id)
                .onCacheMissResume(() -> fetch(id))
                .andWriteWith((key, signal) -> Mono.fromRunnable(() ->
                        Optional.ofNullable(signal.get())
                                .ifPresent(value -> cache.put(key, value))));
    }

    //fetch data from db
    private Mono<Fruit> fetch(final Long id) {
        //todo read from db
        return Mono.just(new Fruit(id, id.toString()));
    }

}
