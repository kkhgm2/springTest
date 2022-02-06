package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employeee;

@RestController
public class HelloController {
	@GetMapping("/test")
	public Employeee getTest() {
		return new Employeee("koki", 30);
	}
}
