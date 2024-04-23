package com.salesianostriana.dam.ejemplo03bucleyswitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Anotamos la clase con @Service para decir que en ella
//incluiremos los servicios de nuestra aplicación
@Service
public class ProductService {

	public List<Product> getLista(){
		return Arrays.asList(
				new Product(1, "Botijo", "Enfría hasta menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Product(2, "BotijoExtra", "Enfría hasta menos 200 grados", 200.50, true, LocalDateTime.now())
				);
	}
	
}
