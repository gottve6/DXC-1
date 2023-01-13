package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class APIGatewayController {
	
	@GetMapping("/status")
	public String getway() {
		return "API Gateway";
	}

}
