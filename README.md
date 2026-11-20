# Spring Boot examples by integration

A Maven collection separates Spring integrations into small applications. The JPA example contains an HTTP controller, user entity and repository. The Kafka example has separate HTTP and consumer classes.

Start with the JPA user controller and repository to follow a request into persistence. Then open the Kafka controller and consumer to compare that path with asynchronous messaging. Other modules vary in depth and several contain only an application entry point and configuration.

- [UserController.java](spring-data-jpa/src/main/java/com/springboot/jpa/controller/UserController.java)
- [UserRepository.java](spring-data-jpa/src/main/java/com/springboot/jpa/repository/UserRepository.java)
- [KafkaController.java](spring-kafka/src/main/java/com/springboot/kafka/controller/KafkaController.java)
- [KafkaConsumer.java](spring-kafka/src/main/java/com/springboot/kafka/consumer/KafkaConsumer.java)

## 📁 ساختار پروژه

```
SpringBootProjects/
├── pom.xml                    # Parent POM
├── docker-compose.yml         # تنظیمات Docker
├── spring-boot-core/          # ماژول اصلی Spring Boot
├── spring-data-jpa/           # Spring Data JPA
├── spring-data-jdbc/          # Spring Data JDBC
├── spring-data-mongodb/       # Spring Data MongoDB
├── spring-data-redis/         # Spring Data Redis
├── spring-security/           # Spring Security
├── spring-cloud-config/       # Spring Cloud Config
├── spring-cloud-gateway/      # Spring Cloud Gateway
├── spring-cloud-eureka/       # Spring Cloud Eureka
├── spring-integration/        # Spring Integration
├── spring-batch/              # Spring Batch
├── spring-kafka/              # Spring Kafka
├── spring-amqp/               # Spring AMQP
├── spring-session/            # Spring Session
├── spring-hateoas/            # Spring HATEOAS
├── spring-graphql/            # Spring GraphQL
└── spring-rest-docs/          # Spring REST Docs
```

## 🔧 پورت‌های سرویس‌ها

| سرویس            | پورت        |
|------------------|-------------|
| Spring Boot Core | 8080        |
| Spring Data JPA  | 8081        |
| Spring Security  | 8083        |
| Spring Kafka     | 8084        |
| Spring Batch     | 8085        |
| H2 Database      | 8082, 9092  |
| Redis            | 6379        |
| MongoDB          | 27017       |
| RabbitMQ         | 5672, 15672 |
| Kafka            | 9092        |
| Eureka Server    | 8761        |

## 📝 مجوز

این پروژه تحت مجوز MIT منتشر شده است.
