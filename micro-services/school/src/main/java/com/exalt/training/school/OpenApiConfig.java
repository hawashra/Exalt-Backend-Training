package com.exalt.training.school;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Hamza Awashra",
                        email = "hamzaawashra@outlook.com",
                        url = "https://github.com/hawashra"
                ),
                description = "This is a simple school service that allows you to save schools and get all schools." +
                        "as well as get all students in a specific school.",
                title = "OpenAPI specification for the school service - Hamza",
                version = "1.0.0"
        )
)
public class OpenApiConfig {

}
