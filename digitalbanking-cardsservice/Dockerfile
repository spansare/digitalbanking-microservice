FROM maven

RUN apt-get install git

RUN git clone https://github.com/spansare/digitalbanking-microservice

RUN mvn -f /digitalbanking-microservice/digitalbanking-cardsservice/pom.xml clean install

CMD ["java", "-jar", "/digitalbanking-microservice/digitalbanking-cardsservice/target/card.jar", "server", "configuration.yml"]
