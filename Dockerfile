FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY target/springboot-aws-deploy-service.jar springboot-aws-deploy-service.jar
ENTRYPOINT ["java","-jar","/springboot-aws-deploy-service.jar"]