package com.jpa.imc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.imc.Indice;

@RestController
public class ImcController {

	@PostMapping("imc")
	public String getImc(@RequestParam double poids,@RequestParam double taille)
	{
		Indice indice=new Indice(poids, taille);
		return indice.toString();
		
		
	}
}
