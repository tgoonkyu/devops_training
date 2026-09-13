package com.trivium.springwebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springwebapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springwebapp2Application.class, args);
		System.out.println("Secondary app");
	}

}
