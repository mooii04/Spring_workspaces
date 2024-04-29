package com.salesianostriana.dam.pruebasmoisesdoradoproyecto.servicio.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

	// Ponemos que la clase es abstracta para que nadie instancie esta clase
	// P es el tipo de dato del repositorio
public abstract class BaseServicempl <T, ID, R extends JpaRepository<T, ID>> implements BaseService <T, ID>{

	@Autowired
		// Tiene que llegar a ser protected porque sino no funciona con private y hay que hacer más cosas
		// así se usa en clase que se heredan
	protected R repository;
	
	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<T> findById(ID id) {
		return repository.findById(id);
	}

	@Override
	public T save(T t) {
		return repository.save(t);
	}

	@Override
	public T edit(T t) {
		return repository.save(t);
	}

	@Override
	public void delete(T t) {
		repository.delete(t);		
	}

	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);		
	}

}
