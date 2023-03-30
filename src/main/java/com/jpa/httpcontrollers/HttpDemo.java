package com.jpa.httpcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpDemo {

	@GetMapping("user")
	public String username(@RequestParam(required = false,defaultValue = "guest") String nom,@RequestParam int age)
	{
	return "bonjour "+nom+ " age="+age;	
	}
	@PostMapping("user")
	public String authentification(@RequestParam String login,@RequestParam String password)
	{
		return "Hello "+login;
	}
}
