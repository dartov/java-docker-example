Simple example for Spring Boot application inside Docker container.

Build a jar:

     mvn clean package

Run as standalone java app: 

    java -jar target/java-docker-example.jar

Build docker image:

    mvn docker:build

Run as docker container:

    docker run -d -p 8080:8080 dartov/java-docker-example:1.0-SNAPSHOT

Run as docker container with customer command line arguments:

    docker run -d -p 8080:8080 dartov/java-docker-example:1.0-SNAPSHOT java -jar java-docker-example.jar --my.property=myValue