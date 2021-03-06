package com.cognizant;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.cognizant.truyum, com.cognizant.truyum.dao, com.cognizant.truyum.controller,com.cognizant.truyum.model,com.cognizant.truyum.service, com.cognizant.truyum.repository,com.cognizant.truyum.util"})
public class App {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(App.class, args);

	}
}
	