package com.salesianostriana.dam.pruebasmoisesdoradoproyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.pruebasmoisesdoradoproyecto.modelo.Hermano;
import com.salesianostriana.dam.pruebasmoisesdoradoproyecto.servicio.hermano.HermanoServicio;

@Controller
public class HermanoControlador {
	
	@Autowired
	private HermanoServicio hermanoServicio;
	
	@GetMapping("/list")
	public String lista(Model model) {
		model.addAttribute("hermano", hermanoServicio.findAll());
		return "lista";
	}
	
	@GetMapping ("/hermano")
	public String showForm(Model model) {
		Hermano hermano = new Hermano();
		model.addAttribute("hermanoForm", hermano);
		
		return "form";
	}
	
	@PostMapping ("/addHermano")
	public String submit(@ModelAttribute("hermanoForm") Hermano hermano, Model model) {

		model.addAttribute("hermano", hermano);

		return "view";
	}
	
}
