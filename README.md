 # REST API
The spring cache APIs are still blocking which is not good and our system will not be fully reactive if we are use WebFLux. But there is hack-way using an reactor [cache add-on](https://github.com/reactor/reactor-addons/tree/master/reactor-extra/src/main/java/reactor/cache) which can be used with Spring CacheManager. So until this blocking cache issue is solved we can use this add-on.
 
 ## Used Technologies and frameworks
 * Java 11
 * Spring boot
 * Spring Webflux
 * GuavaCache
 
 ## Description
 Store most recently used data in Cache.
 
 # Samples
 ## Sample Request
   GET http://localhost:8080/fruit/1
 
 ## Run  tests: 
 In order to compile and run the project you need to have Java 11 and Maven.
 
 * mvn clean compile
 * mvn test
 
 ## Run project: 
 * mvn spring-boot:run  
 or  
 * docker build . -t webflux/restapi
 * docker run -p 8080:8080 webflux/restapi
