package com.krishna.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFallBackController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User Service is Down";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "Department Service is Down";
	}
}
