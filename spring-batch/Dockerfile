FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-batch-*.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]

