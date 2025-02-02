# Use an official Maven image to build the app
FROM maven:3.9.0-amazoncorretto-17 AS build
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Use Eclipse Temurin as the base JRE image (or Amazon Corretto, or any OpenJDK)
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/errorlog-1.0.0.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
