package com.salesianostriana.dam.primerproyectodatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Alumno {

	@Id @GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	private String email;
	
	public Alumno(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
}
