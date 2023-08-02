package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Ciao %s!", name);
	}

	@GetMapping("/ciao")
	public String ciao(@RequestParam(value = "Giam", defaultValue = "Mondo") String name) {
		return String.format("Ciao %s!", name);
	}

	@GetMapping("/toupper")
	public String toupper(@RequestParam(value = "Giam", defaultValue = "Mondo") String name) {
		name = name.toUpperCase();
		return String.format("Questo testo sarà maiuscolo: %s!", name);
	}
}