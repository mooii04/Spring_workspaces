package com.salesianostriana.dam.ejemplospringcore3web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainCotroller {

	@Autowired
	private Saludator saludator;
	
	@GetMapping("/")
	@ResponseBody // esta es solo para este ejemplo
	public String welcome() {
		return saludator.saludar();
	}
	
}
