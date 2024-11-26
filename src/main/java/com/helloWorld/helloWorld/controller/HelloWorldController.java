package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping 
    public String helloWorld() {
    	return "Hello World!!!";
    }
    
    @GetMapping("/bsm") 
    public String bsm() {
    	return "Orientação ao futuro\nProatividade\nResponsabilidade pessoal";
    }
    
    @GetMapping("/objetivos")
    public String objetivos() {
    	return "- Reforçar meus conhcimentos em mysql\n"
    		   +"- Fazer exercícios da semana\n"
    		   +"- Code Review do código de outros participantes\n"
    		   +"- Revisar meus códigos";
    }
}
