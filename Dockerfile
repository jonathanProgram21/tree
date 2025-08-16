FROM openjdk:17-jdk-slim

arg JAR_FILE=target/arbol-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "arbol-0.0.1-SNAPSHOT.jar" ]