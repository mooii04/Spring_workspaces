package com.salesianostriana.dam.ejemplo03bucleyswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Anotamos con Controller
@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	//Petición que hay que poner en localhost para buscar
	@GetMapping ("/productos")
	public String controladorCondicionales (Model model) {
		 
		/*
		 * Añadimos al model la lista de productos que viene del servicio,
		 * devuelta por el método getLista
		 */
		model.addAttribute("productList", service.getLista());
		return "PlantillaBucleYFormateo";//Se devuelve el nombre de la plantilla html ... 
	}
	
}
