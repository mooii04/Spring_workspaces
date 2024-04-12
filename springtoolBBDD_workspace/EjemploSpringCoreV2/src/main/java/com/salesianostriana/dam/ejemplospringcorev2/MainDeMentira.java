package com.salesianostriana.dam.ejemplospringcorev2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private Saludator saludator;
	
	@PostConstruct
	public void init() {
		
		saludator.imprimirSaludo();
		
	}
	
}
