package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.primerproyectodatajpa.repositorios.AlumnoRepositorio;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepositorio repositorio;
	
	@PostConstruct
	void ejecutar() {
		repositorio.save(new Alumno("Moisés", "Dorado Gutiérrez", "moises.mdg04@gmail.com"));
	}
	
}
