package com.example.cicdtest.fortest;

import org.springframework.web.bind.annotation.GetMapping;

public class ForTestController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
