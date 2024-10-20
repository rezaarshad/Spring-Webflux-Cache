# REST API

The Spring Cache APIs are still blocking, meaning that your services won't be fully reactive if you're using WebFlux with cache APIs. However, there is a workaround using Reactor's [cache add-on](https://github.com/reactor/reactor-addons/tree/master/reactor-extra/src/main/java/reactor/cache), which can be integrated with Spring's `CacheManager`. Until the blocking cache issue is resolved, you can use this add-on for a more reactive approach.

## Technologies and Frameworks Used
* Java 11
* Spring Boot
* Spring WebFlux
* Guava Cache

## Description
This API stores the most recently used data in the cache.

## Sample Request
GET http://localhost:8080/fruit/1

## Running Tests
To compile and run the project, ensure you have Java 11 and Maven installed.

```bash
mvn clean compile
mvn test

## Running the Project
mvn spring-boot:run

or with Docker:
docker build . -t webflux/restapi
docker run -p 8080:8080 webflux/restapi




