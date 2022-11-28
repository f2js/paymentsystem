FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/PaymentSystem-0.0.1-SNAPSHOT.jar PaymentSystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","PaymentSystem-0.0.1-SNAPSHOT.jar"]