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
		
		//Curso c = new Curso ("1º DAM", "Miguel Campos DEV");
		
		Curso c = Curso.builder()
				.nombre("1º DAM")
				.tutor("Miguel Campo DEV")
				.build();
		
		cursoRepo.save(c);
		
		Alumno a = Alumno.builder()
			.nombre("Moisés")
			.apellidos("Dorado Gutiérrez")
			.email("dorado.gumoi24@triana.salesianos.edu")
			.build();
		
		Alumno a2 = Alumno.builder()
			.nombre("Pablo")
			.apellidos("Dorado Gutiérrez")
			.build();	
			
		//alumRepo.save(new Alumno("Moisés", "Dorado Gutiérrez", "moises.mdg04@gmail.com", c));
		//alumRepo.save(new Alumno("Pablo", "Dorado Gutiérrez", "pablo.pdg08@gmail.com", c));
		
		alumRepo.save(a);
		alumRepo.save(a2);
		
		//MALA manera de hacerlo
		//repositorio.findAll().forEach(a -> System.out.println(a));
		
		//BUENA manera de hacerlo
		alumRepo.findAll().forEach(System.out::println);		
	}
	
}
