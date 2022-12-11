package com.salesianostriana.dam.primerejemplo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		description = "Una api de países"
))
public class PrimerEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerEjemploApplication.class, args);
	}

}
