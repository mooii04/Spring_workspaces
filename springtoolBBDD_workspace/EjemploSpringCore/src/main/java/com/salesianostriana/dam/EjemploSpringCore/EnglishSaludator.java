package com.salesianostriana.dam.EjemploSpringCore;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		// TODO Auto-generated method stub
		System.out.println("Hello coders of 1º DAM");
	}

}
