openjdk:latest
EXPOSE 5000
ADD target/customer-service-0.0.1-SNAPSHOT.jar customer-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /customer-service-0.0.1-SNAPSHOT.jar"]