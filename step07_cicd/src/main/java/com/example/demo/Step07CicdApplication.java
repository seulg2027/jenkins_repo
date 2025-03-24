package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.fisa.ce.controller")
public class Step07CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step07CicdApplication.class, args);
	}

}
