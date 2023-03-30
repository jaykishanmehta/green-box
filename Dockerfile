FROM openjdk:11
MAINTAINER Jaykishan Mehta <jaykishanmehta1991@gmail.com>
COPY target/green-box-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
