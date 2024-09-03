package com.exalt.training.student;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "OpenAPI specification for the student service - Hamza",
                version = "1.0.0",
                description = "This is a simple student service that allows you to save students and get all students.",
                contact = @Contact(
                        name = "Hamza Awashra",
                        email = "hamzaawashra@outlook.com",
                        url = "https://github.com/hawashra"
                )
        )
)
public class OpenApiConfig {

}
