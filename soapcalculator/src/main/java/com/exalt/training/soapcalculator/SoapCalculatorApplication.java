package com.exalt.training.soapcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for the SOAP Calculator application.
 * This class serves as the entry point for the Spring Boot application.
 * It is annotated with @SpringBootApplication, which is a convenience
 * annotation that adds:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
 *   other beans, and various property settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the
 *   com.exalt.training.soapcalculator package, allowing it to find the controllers.
 */
@SpringBootApplication
public class SoapCalculatorApplication {

    /**
     * The main method that serves as the entry point for the Spring Boot application.
     * It uses SpringApplication.run() to launch the application.
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SoapCalculatorApplication.class, args);
    }
}
