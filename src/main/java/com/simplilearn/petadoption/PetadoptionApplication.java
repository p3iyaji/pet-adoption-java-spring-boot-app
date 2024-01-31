package com.simplilearn.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.simplilearn.petadoption.controllers"})
public class PetadoptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetadoptionApplication.class, args);
	}

}
