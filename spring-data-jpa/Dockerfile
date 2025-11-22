FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-data-jpa-*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]

