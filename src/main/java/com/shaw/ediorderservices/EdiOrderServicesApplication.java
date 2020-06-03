package com.shaw.ediorderservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EdiOrderServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdiOrderServicesApplication.class, args);
	}

}
