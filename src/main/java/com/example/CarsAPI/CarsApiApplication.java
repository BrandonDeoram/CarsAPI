package com.example.CarsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApiApplication.class, args);
	}
	@GetMapping("/")
	public String hello(){
		return "Cars API";
	}

}
