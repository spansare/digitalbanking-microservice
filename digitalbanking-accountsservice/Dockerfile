FROM maven

RUN apt-get install git

RUN git clone https://github.com/spansare/digitalbanking-microservice

RUN cd digitalbanking-microservice/digitalbanking-accountsservice

RUN mvn -f /digitalbanking-microservice/digitalbanking-accountsservice/pom.xml clean install

CMD ["java", "-jar", "/digitalbanking-microservice/digitalbanking-accountsservice/target/accountservices-1.0.jar"]
