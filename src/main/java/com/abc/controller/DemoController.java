package com.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/")
	public String testMethod() {
		return "This is a test method inside Spring Boot Jenkins Pipeline Project";
	}
}
