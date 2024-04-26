package com.salesianostriana.dam.ejemploformulariosv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformulariosv1.model.Empleado;

@Controller
public class EmpleadoController {

	@GetMapping ("/empleado")
	public String showForm(Model model) {
		
		//El empleado se instancia vacío porque es el que se usa
		//para pintar el formulario que estamos creando sin datos
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		//Devolvemos el nombre del html que pinta el formulario
		return "form";
		
	}
	
	@PostMapping ("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		
		//Se añade al modelo, el empleado que se creará al recoger los datos del form
		model.addAttribute("empleado", empleado);
		
		//En este ejemplo sencillo se muestra la página con la información mandada
		//el formulario al pulsar el boyón submit, no se guarda en la base de datos, 
		//solo mostramos lo que se escribe en el formulario en otra página web
		return "view";
	
	}
	
}
