package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "1. Ser mais proativa\n"
				+ "2. Trabalhar melhor em equipe\n"
				+ "3. Ter mais atenção aos detalhes";
	}
	
}
