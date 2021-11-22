# EXCHANGE RATE SERVICE

## Description
This is a simple application that can access a currency exchange service and issue a GIF in response. 
Completed as part of a test task for the bank.

## Usage
Launch the docker container :     
`docker run -p 8080:8080 marat1989/exchangeservice:latest`          
Open:         
`http://localhost:8080/api/gif?base=USD`

Note : API representing GIF for free only for USD currency

## Stack
- Open JDK 1.0.11.RELEASE
- Spring Boot
- OpenFeign
- Slf4j
- Lombook
   
   


