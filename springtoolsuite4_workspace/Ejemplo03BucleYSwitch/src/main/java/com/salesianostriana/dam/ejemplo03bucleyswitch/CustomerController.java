package com.salesianostriana.dam.ejemplo03bucleyswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/listGen")
	public String listaVarios (Model model) {
		model.addAttribute("customerList", service.getLista());		
		return "PlantillaSwitch";
	}
}
