FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
COPY target/example-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar" , "example-0.0.1-SNAPSHOT.jar"]
