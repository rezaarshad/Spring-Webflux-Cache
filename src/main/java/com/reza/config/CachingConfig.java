package com.reza.config;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CachingConfig {

    private static String ARTIST_CACHE_NAME = "artists";

    @Bean
    public Cache cacheArtists() {
        return new GuavaCache(ARTIST_CACHE_NAME, CacheBuilder.newBuilder()
                .expireAfterWrite(1, TimeUnit.DAYS)
                .build());
    }

}

