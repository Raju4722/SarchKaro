# Use a base image with Java 21
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file built by Gradle into the container

COPY build/libs/SarchKaro-0.0.1-SNAPSHOT.jar app/SarchKaro-0.0.1-SNAPSHOT.jar

# Expose the port your Spring Boot application listens on
EXPOSE 8080

# Run your Spring Boot application
ENTRYPOINT ["java", "-jar", "SarchKaro-0.0.1-SNAPSHOT.jar"]
