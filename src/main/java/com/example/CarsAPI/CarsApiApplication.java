package com.example.CarsAPI;

import com.example.CarsAPI.Car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CarsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApiApplication.class, args);
	}
	@GetMapping("/")
	public List<Car> hello(){
		return List.of(
				new Car(
						1,
						"Honda",
						"Civic",
						"Sedan",
						"Si",
						"Black",
						"K24",
						2013,
						200
				),
				new Car(
						2,
						"Honda",
						"Civic",
						"Coupe",
						"Si",
						"Red",
						"K24",
						2014,
						200
				)
		);
	}

}
