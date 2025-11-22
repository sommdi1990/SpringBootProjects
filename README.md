# Spring Boot Projects

مجموعه کامل پروژه‌های Spring Boot با Java و Maven

## 📋 فهرست محتوا

- [نصب و راه‌اندازی](#نصب-و-راه‌اندازی)
- [ساختار پروژه](#ساختار-پروژه)
- [اجرای پروژه](#اجرای-پروژه)
- [مستندات](#مستندات)

## 🚀 نصب و راه‌اندازی

### پیش‌نیازها

- Java 17 یا بالاتر
- Maven 3.6+
- Docker و Docker Compose

### نصب

```bash
# کلون کردن پروژه
git clone <repository-url>
cd SpringBootProjects

# ساخت پروژه
mvn clean install
```

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

## 🐳 اجرای پروژه

### اجرای سرویس‌های Docker

```bash
# اجرای تمام سرویس‌ها
docker-compose up -d

# اجرای سرویس خاص
docker-compose up -d h2-database
docker-compose up -d redis
docker-compose up -d mongodb
docker-compose up -d rabbitmq
docker-compose up -d kafka
```

### اجرای ماژول‌ها

```bash
# اجرای ماژول خاص
cd spring-boot-core
mvn spring-boot:run

# یا با Docker
mvn clean package
docker build -t spring-boot-core .
docker run -p 8080:8080 spring-boot-core
```

## 📚 مستندات

مستندات کامل فارسی در پوشه `SpringBootProjects.wiki/` قرار دارد:

- [صفحه اصلی Wiki](./SpringBootProjects.wiki/Home.md)
- [Spring Boot Core](./SpringBootProjects.wiki/Spring-Boot-Core.md)
- [Spring Data JPA](./SpringBootProjects.wiki/Spring-Data-JPA.md)
- [Spring Security](./SpringBootProjects.wiki/Spring-Security.md)
- [Spring Kafka](./SpringBootProjects.wiki/Spring-Kafka.md)
- [Spring Batch](./SpringBootProjects.wiki/Spring-Batch.md)
- و سایر ماژول‌ها...

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

