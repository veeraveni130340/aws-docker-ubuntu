FROM openjdk:latest
EXPOSE 5000
ADD target/customer-service.jar customer-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /customer-service.jar"]