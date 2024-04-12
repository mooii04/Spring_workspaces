package com.salesianostriana.dam.EjemploSpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator") //Este usa el mensaje en este caso del bean que pongamos en las comillas
	private Saludator saludator;
	
	@PostConstruct
	public void init() {
		
		saludator.imprimirSaludo();
		
	}
	
}
