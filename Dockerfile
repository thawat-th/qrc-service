FROM java:8-jre-alpine
#FROM openjdk:8-jdk-alpine

EXPOSE 8080

RUN mkdir /app

COPY target/*.jar /app/qrc-service.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/qrc-service.jar"]

#HEALTHCHECK --interval=1m --timeout=3s CMD wget -q -T 3 -s http://localhost:8080/actuator/health/ || exit 1
