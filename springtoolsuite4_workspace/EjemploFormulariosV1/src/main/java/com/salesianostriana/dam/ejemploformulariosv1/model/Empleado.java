package com.salesianostriana.dam.ejemploformulariosv1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Empleado {

	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private String email;
	
}
