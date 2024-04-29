package com.salesianostriana.dam.pruebasmoisesdoradoproyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Hermano {
	
	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	private String email;
	
}
