package com.phearun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/public/hello")
	public String publicResource(){
		return "Hello, This is public resource!";
	}
	
	@GetMapping("/private/hello")
	public String privateResource(){
		return "Hello, This is private resource!";
	}
}
