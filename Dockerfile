FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY bulid/libs/jenkins_test_app-0.0.1-SNAPSHOT.jar /opt/app/test_app.jar
CMD ["java", "-jar","otp/app/test_app.jar"]
EXPOSE 8083