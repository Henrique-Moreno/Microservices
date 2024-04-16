# Estágio de construção
FROM ubuntu:latest

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

COPY target/airports-0.0.1-SNAPSHOT.jar /app/airports.jar

WORKDIR /app

EXPOSE 5000

CMD ["java", "-jar", "airports.jar"]








