FROM openjdk:13-ea-12-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN   apk update \                                                                                                                                                                                                                        
  &&   apk add ca-certificates wget \                                                                                                                                                                                                      
  &&   update-ca-certificates
RUN wget -O dd-java-agent.jar "https://dtdg.co/latest-java-tracer"
ENTRYPOINT ["java","-javaagent:/dd-java-agent.jar -jar","/app.jar"]