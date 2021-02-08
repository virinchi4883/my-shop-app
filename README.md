# MyShop App

### API Documentation

As per the requirement, It was expected to build any one endpoint that connects with a mock server to fetch the data. I
created one endpoint to return **order** details given a perticular order id. This endpoint can be used on order details
page to show full information.

Here is one example of the sample endpoint :-
> http://localhost:8080/order/2765184133636621506

### Guides

This is developed using spring boot framework. You can run the folowing commond to run the app:-

`mvn clean install`

`mvn spring-boot:run`

### Mock Server

For simplicity, instead of setting up wiremock standalone server on my local machine, I used **MockLab** service and
created stubs there.