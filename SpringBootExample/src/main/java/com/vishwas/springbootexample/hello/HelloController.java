package com.vishwas.springbootexample.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping ("/hi")
	public String sayHello() {
		return "Hello Spring Boot";
	}

}
