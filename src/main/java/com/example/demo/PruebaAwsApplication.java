package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		  "com.example.demo",     // raíz donde está el main
		  "com.example.demo.api",           // paquete del controller
		  "com.example.demo.repository",     // repos
		  "com.example.demo.model"
		})
public class PruebaAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaAwsApplication.class, args);
	}

}
