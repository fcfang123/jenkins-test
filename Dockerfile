FROM openjdk:8-jdk
LABEL maintainer=fc

COPY target/*.jar /app.jar
EXPOSE 8800

#
ENTRYPOINT ["/bin/sh","-c","java -Dfile.encoding=utf8 -jar /app.jar"]
