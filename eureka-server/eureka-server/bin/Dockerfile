FROM openjdk:11-jdk-slim
ARG JAR_FILE=out/artifacts/eureka_server_jar/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]