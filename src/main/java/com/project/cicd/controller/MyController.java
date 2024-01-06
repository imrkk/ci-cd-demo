package com.project.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class MyController {
	
	@PostMapping("/getData")
	public String getUserData() {
		return "Hello Ravi";
	}
	
	
	@GetMapping("/getData")  //This is for get
	public String userData() {
		return "Hello Ravi Kumar";
	}
	
	
	
	

}
