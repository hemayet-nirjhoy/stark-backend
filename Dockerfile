# Use an official OpenJDK 21 base image for development
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /workspace

# Install Maven (or Gradle, depending on your preference)
RUN apt-get update && apt-get install -y \
    maven \
    git \
    && rm -rf /var/lib/apt/lists/*

# Copy the project files into the container
COPY . .

# Expose the port for the Spring Boot application
EXPOSE 8080

# The command to start the Spring Boot application (you can change it later)
CMD ["mvn", "spring-boot:run"]
