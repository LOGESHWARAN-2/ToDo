# Use Java 23
FROM eclipse-temurin:23-jdk

# Set working directory
WORKDIR /app

# Copy project
COPY . .

# Build Spring Boot JAR
RUN ./mvnw clean package -DskipTests || mvn -B clean package -DskipTests

# Expose port (Spring Boot default)
EXPOSE 8080

# Run the JAR file
CMD ["sh", "-c", "java -jar target/*.jar"]
