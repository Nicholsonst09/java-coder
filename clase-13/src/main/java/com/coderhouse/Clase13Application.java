package com.coderhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Clase13Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase13Application.class, args);
	}

	
	@Bean   //al utilizarlo cada vez que usemos nos retorna un nuevo RestTemplate y va a estar disponible en cualquier lado. Simplemente lo inyectamos y utilizamos
	RestTemplate restTemplate() {
		return new RestTemplate();    
	}
}
