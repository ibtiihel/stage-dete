FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
COPY target/SpringV1-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar" , "/SpringV1-0.0.1-SNAPSHOT.jar"]