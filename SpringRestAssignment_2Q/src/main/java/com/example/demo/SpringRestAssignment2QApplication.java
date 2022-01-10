package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SpringRestAssignment2QApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAssignment2QApplication.class, args);
		 
	}
   
}
