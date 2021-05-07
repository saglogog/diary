package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "I am the Boot!";
	}

}