package com.example.webapp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Webapp3Application {

	public static void main(String[] args) {
		SpringApplication.run(Webapp3Application.class, args);
	}

	@GetMapping(path="/test3")
	public String showme() {
		return "This is my webapp3 testing";
	}
}
