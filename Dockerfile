FROM openjdk:17
EXPOSE 8080
ADD target/eventsnow-0.0.1-SNAPSHOT.jar eventsnow.jar
ENTRYPOINT ["java","-jar","/eventsnow.jar"]