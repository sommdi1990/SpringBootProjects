FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/spring-boot-core-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

