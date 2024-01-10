package com.project.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdApplication {
	
	

	public static void main(String[] args) {
		
		System.out.println("========================> Hello Ravi");
		
		SpringApplication.run(CicdApplication.class, args);
		
	}

}
