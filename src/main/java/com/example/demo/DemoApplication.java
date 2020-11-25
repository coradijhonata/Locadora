package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.example.demo.domain.entities", "com.example.demo.repository"})
public class DemoApplication {

	@GetMapping("/")
	String home() {
		return " Lança a brava Spring !";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}