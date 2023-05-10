package com.aws.awsassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/complete")
	public void showName() {
		System.out.println("Project executed");
	}

}
