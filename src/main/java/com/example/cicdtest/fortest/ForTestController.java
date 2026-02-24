package com.example.cicdtest.fortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForTestController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
