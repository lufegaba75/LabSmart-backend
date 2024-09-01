FROM openjdk:17-jdk-alpine

COPY target/labsmart-0.0.1-SNAPSHOT.jar java_app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "java_app.jar"]
