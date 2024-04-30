package com.salesianostriana.dam.ejemploformulariosv2.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	// Simulamos un servicio que nos da la lista de tipos de cerveza que hay, es de
	// tipos String para trabajar con dichos nombres en los los radio buttons
	public String[] getTipos() {
		String[] tipos = new String[] { "Lager", "Pilsen", "Guiness", "Sin filtrar" };
		return tipos;
	}

}
