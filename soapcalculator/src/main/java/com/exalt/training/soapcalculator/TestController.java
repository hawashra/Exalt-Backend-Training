package com.exalt.training.soapcalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/status")
    public String checkStatus() {
        return "SOAP service is up and running!";
    }
}