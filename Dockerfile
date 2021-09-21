FROM openjdk:8-jdk-alpine
COPY target/msdevops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]