package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/Mateus")
	public @ResponseBody String greetingFulano() {
		return "Hello, Mateus!!!";
	}
	
	@RequestMapping("/Hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hotfix";
	}

	
	/********
	 * 
	 * Modificação original
	 * 
	 *******/
	
	/**
	
	
	/************
	 * 
	 * Modificação cópia
	 * 
	 ***********/
}
