# Calculator  

## About
This project uses java jdk 11.

## How to
Execute the following commands:

```
git clone https://github.com/ASTM-GFT/calculator.git

cd calculator
mvn install:install-file -Dfile=src/main/resources/tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar

mvn clean install
```

Execute the generated jar file inside "target" directory with the following command

java -jar ./target/calculator-1.0.0-SNAPSHOT.jar

## Endpoints

### Sum endpoint
http://localhost:8080/calculator/sum

RequestParams: firstNumber and secondNumber.

Example request: curl --location --request GET 'http://localhost:8080/calculator/sum?firstNumber=1&secondNumber=5'

### Subtract endpoint
http://localhost:8080/calculator/subtract

RequestParams: firstNumber and secondNumber.

Example request: curl --location --request GET 'http://localhost:8080/calculator/subtract?firstNumber=1&secondNumber=5'

## Libraries
- Spring Boot 2.6.2
- Spring Boot Test (Junit 5, Mockito)
- Lombok
