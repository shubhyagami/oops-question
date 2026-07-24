# Stage 1: Build the application
FROM maven:3.9.5-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies (for caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Clone the target repository during the build step so it's available for the application to serve
RUN apt-get update && apt-get install -y git && \
    git clone https://github.com/Arijit-SE/Java-Solutions-TCS-IPA-Questions.git data/tcs-ipa

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built jar and the cloned data folder from the build stage
COPY --from=build /app/target/*.jar app.jar
COPY --from=build /app/data ./data

# Expose port (Render sets the PORT env variable automatically)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
