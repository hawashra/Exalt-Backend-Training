package com.exalt.training.SoapApiApp.controllers;


import com.exalt.training.SoapApiApp.models.Car;
import com.exalt.training.SoapApiApp.repositories.CarRepository;
import com.exalt.training.ws.GetCarRequest;
import com.exalt.training.ws.GetCarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soapcar/ws";

    @Autowired
    private CarRepository carRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCar(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        Car car = carRepository.findById(request.getId()).orElse(null);
        response.setCar(car);
        return response;
    }
}

