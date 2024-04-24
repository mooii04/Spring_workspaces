package com.salesianostriana.dam.ejemplo03bucleyswitch;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public List<Customer> getLista() {
		return Arrays.asList(
				new Customer(1, "Ángel", "Naranjo", "González", "male"),
				new Customer(2, "Luismi", "López", "Magaña", "male"),
				new Customer(3, "Novia de ", "Doraemon", "No sé", "female"),
				new Customer(4, "Corona", "Virus", "A", " ")
				);		
	}
}
