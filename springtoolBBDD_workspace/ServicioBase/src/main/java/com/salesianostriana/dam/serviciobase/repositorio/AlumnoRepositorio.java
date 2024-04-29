package com.salesianostriana.dam.serviciobase.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.serviciobase.modelo.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
	
}
