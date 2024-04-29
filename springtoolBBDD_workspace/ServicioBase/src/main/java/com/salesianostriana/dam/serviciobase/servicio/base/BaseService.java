package com.salesianostriana.dam.serviciobase.servicio.base;

import java.util.List;
import java.util.Optional;

	// T --> tipo de dato de la entidad
	// ID --> tipo de del identificador de la entidad
public interface BaseService <T, ID>{

	List<T> findAll();
	
	Optional<T> findById(ID id);
	
	T save(T t);
	
	T edit(T t);
	
	void delete(T t);
	
	void deleteById(ID id);
	
}
