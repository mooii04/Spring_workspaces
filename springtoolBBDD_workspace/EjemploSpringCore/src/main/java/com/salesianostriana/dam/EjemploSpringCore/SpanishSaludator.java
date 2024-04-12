package com.salesianostriana.dam.EjemploSpringCore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary 	/* Esto lo que hacees que coge si hay alguna duda de que bean coger
 			usa este de manera principal*/
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos los programadores de 1º DAM");
	}

}
