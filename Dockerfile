FROM apache/beam_java17_sdk
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/medical.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]