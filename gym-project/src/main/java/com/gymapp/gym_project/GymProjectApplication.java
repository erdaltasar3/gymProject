package com.gymapp.gym_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.gymapp.")
@ComponentScan(basePackages = "com.gymapp")
@SpringBootApplication
public class GymProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymProjectApplication.class, args);
	}

}
