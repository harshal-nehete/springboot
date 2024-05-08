package com.harshal.capstoneproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetController {

	@GetMapping("/hello")
	public String greet() {
		return "Hello from Spring Boot Controller";
	}
}
