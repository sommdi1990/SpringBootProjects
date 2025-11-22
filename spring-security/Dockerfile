FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/spring-security-*.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]

