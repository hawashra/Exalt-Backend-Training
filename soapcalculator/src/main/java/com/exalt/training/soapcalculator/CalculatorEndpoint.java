package com.exalt.training.soapcalculator;


import com.exalt.training.soapcalculator.jaxb.AddRequest;
import com.exalt.training.soapcalculator.jaxb.AddResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://www.example.org/calculator/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        AddResponse response = new AddResponse();
        response.setResult(request.getA() + request.getB());
        return response;
    }
}