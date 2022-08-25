package com.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		return "Benvenuto a casa Carta";		
	}
	
	@GetMapping("/{input}")
	public String complimenti(@PathVariable String input) {
		return "Benvenuto a casa Carta caro " + input;		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
