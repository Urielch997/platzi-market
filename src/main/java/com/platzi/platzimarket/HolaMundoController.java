package com.platzi.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {
	
	@GetMapping
	public String hola() {
		return "Nunca pares de aprender";
	}
	
}
