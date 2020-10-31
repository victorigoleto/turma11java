package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping("/get1")
	public String hello1() {
		return "Persistência  e Orientação para o Futuro";
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Me familiarizar mais com o SpringBoot estudando no final de semana e claro no feriado :)";
	}


}
