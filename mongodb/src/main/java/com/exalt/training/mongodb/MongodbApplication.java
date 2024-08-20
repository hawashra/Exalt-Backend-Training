package com.exalt.training.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (StudentRepository studentRepository) {
		return args -> {
			Address address = new Address(
					"England", "London", "NE9"
			);

			Student student = new Student(
			"Jamila",
			"Ahmad",
				"jahmed@gmail.com", Gender.FEMALE,
					address,
					List.of("Computer science"),
					BigDecimal.TEN,
					 ZonedDateTime.now()
			);


		};
	}
}
