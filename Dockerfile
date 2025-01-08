# Use an official OpenJDK 21 image as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle wrapper and Gradle build files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
"C:\Users\dines\OneDrive\Desktop\BackApp2\SarchKaro\build\libs\SarchKaro-0.0.1-SNAPSHOT.jar"
# Copy the source code into the container (optional, if you want to build the project inside the container)
COPY src src

# Build the application (you can remove this line if you're building the JAR outside the container)
RUN ./gradlew build --no-daemon

# Copy the JAR file from the build/libs directory into the container
# Adjust the JAR file name to match the actual file generated by Gradle (replace 'your-app-name.jar')
COPY build/libs/SarchKaro-0.0.1-SNAPSHOT.jar/app/SarchKaro-0.0.1-SNAPSHOT.jar

# Expose the application port (default 8080 for Spring Boot)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "SarchKaro-0.0.1-SNAPSHOT.jar"]
