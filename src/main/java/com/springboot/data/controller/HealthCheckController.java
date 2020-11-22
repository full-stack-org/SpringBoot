package com.springboot.data.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/health/v1")
@CrossOrigin
public class HealthCheckController {

	@GetMapping("/healthCheck")
	public String healthCheck() {

		return "Health check tested";
	}
}
