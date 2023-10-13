FROM eclipse-temurin:17
COPY target/jenkins.jar webapp.jar
CMD ["java",-"jar","webapp.jar"]