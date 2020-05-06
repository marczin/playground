package com.marcinrosol.creational;

import com.marcinrosol.creational.builder.Models.Car;
import com.marcinrosol.creational.builder.Models.builders.CarBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreationalApplication.class, args);

		Car c = new CarBuilder("e46","bmw")
				.setColour("black")
				.setKmPassed(300000L)
				.build();
		System.out.println(c);


	}

}
