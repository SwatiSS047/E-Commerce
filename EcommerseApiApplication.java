package com.jsp.ecommerse_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EcommerseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerseApiApplication.class, args);
	}

}
