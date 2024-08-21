package com.exalt.training.custom_annotaiton.controller;

import com.exalt.training.custom_annotaiton.annotation.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class is the REST controller of our application.
 * it as a single GET mapping method that returns a string "Hello World".
 */

@RestController
public class Controller {

    @GetMapping("/hello-world")
    @LogExecutionTime
    public String helloWorldMessage() {
        return "Hello World";
    }
}
