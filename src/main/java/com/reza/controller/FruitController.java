package com.reza.controller;

import com.reza.model.Fruit;
import com.reza.service.FruitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping(path = "/{id}")
    public Mono<ResponseEntity<Fruit>> getFruit(@PathVariable Long id) {
        return fruitService.findById(id)
                .map(ResponseEntity::ok);
    }

}
