FROM amazoncorretto:11-alpine-jdk
MAINTAINER PAB
COPY target/backend-0.0.1-SNAPSHOT.jar  pab-app.jar
ENTRYPOINT ["java", "-jar", "/pab-app.jar"]
