 # REST API - Artist Information
 
 
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