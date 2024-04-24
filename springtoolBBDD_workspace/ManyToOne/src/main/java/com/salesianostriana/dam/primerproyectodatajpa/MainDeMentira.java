package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.primerproyectodatajpa.repositorios.AlumnoRepositorio;
import com.salesianostriana.dam.primerproyectodatajpa.repositorios.CursoRepositorio;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepositorio alumRepo;
	
	@Autowired
	private CursoRepositorio cursoRepo;
	
	@PostConstruct
	void ejecutar() {
		
		Curso c = new Curso ("1º DAM", "Miguel Campos DEV");
		cursoRepo.save(c);
		
		alumRepo.save(new Alumno("Moisés", "Dorado Gutiérrez", "moises.mdg04@gmail.com", c));
		alumRepo.save(new Alumno("Pablo", "Dorado Gutiérrez", "pablo.pdg08@gmail.com", c));
		
		//MALA manera de hacerlo
		//repositorio.findAll().forEach(a -> System.out.println(a));
		
		//BUENA manera de hacerlo
		alumRepo.findAll().forEach(System.out::println);		
	}
	
}
