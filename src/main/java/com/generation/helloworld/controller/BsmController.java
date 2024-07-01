package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-controller")
public class BsmController {
	
	@GetMapping
	public String bsms() {
		return "Persistência\n"
				+ "Proatividade\n"
				+ "Comunicação\n"
				+ "Orientação ao Futuro\n"
				+ "Trabalho em Equipe\n"
				+ "Atenção aos Detalhes\n"
				+ "Responsabilidade Pessoa\n"
				+ "Mentalidade de Crescimento";
	}
	
}
