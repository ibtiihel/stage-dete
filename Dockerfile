FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/example-0.0.1-SNAPSHOT.jar /app/example-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/example-0.0.1-SNAPSHOT.jar"]
