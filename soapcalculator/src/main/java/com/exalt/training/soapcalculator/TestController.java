package com.exalt.training.soapcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller that provides an endpoint to check the status of the SOAP service.
 * This controller is primarily used for testing purposes to ensure that the service is up and running.
 * It is annotated with @RestController, which marks it as a Spring MVC controller where
 * every method returns a domain object instead of a view.
 */
@RestController
@RequestMapping("/api")
public class TestController {

    /**
     * A GET endpoint that returns a message indicating the status of the SOAP service.
     * It is mapped to the URL "/api/status".
     * @return A string message confirming that the SOAP service is operational.
     */
    @GetMapping("/status")
    public String checkStatus() {
        return "SOAP service is up and running!";
    }
}
