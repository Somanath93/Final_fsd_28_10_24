FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY /target/ocms-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT [ "java","-jar","-noverify","ocms-0.0.1-SNAPSHOT.jar"]