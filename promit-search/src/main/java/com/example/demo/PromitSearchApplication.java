package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PromitSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromitSearchApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "<h1> Promit Search Application </h1>";
	}


}
