package com.salesianostriana.dam.pruebasmoisesdoradoproyecto.servicio.hermano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salesianostriana.dam.pruebasmoisesdoradoproyecto.modelo.Hermano;
import com.salesianostriana.dam.pruebasmoisesdoradoproyecto.repositorio.HermanoRepositorio;
import com.salesianostriana.dam.pruebasmoisesdoradoproyecto.servicio.base.BaseServicempl;

@Service
public class HermanoServicio extends BaseServicempl<Hermano, Long, HermanoRepositorio>{
	@Autowired
	private HermanoRepositorio repositorio;
	
	
	public void agregarBD(Hermano hermano) {
		repositorio.save(hermano);
	}
}
