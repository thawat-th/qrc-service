FROM java:8-jre-alpine

EXPOSE 8080

RUN mkdir /app

COPY target/*.jar /app/qrc-service.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/qrc-service.jar"]