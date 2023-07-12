FROM openjdk:17
EXPOSE 8888
ADD ./target/destinos-0.0.1-SNAPSHOT.jar   destinos.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/destinos.jar"]



