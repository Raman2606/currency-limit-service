package com.in28miniutes.microservices.limitsmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28miniutes.microservices.limitsmicroservice.configurations.LimitsConfiguration;
import com.in28miniutes.microservices.limitsmicroservice.dto.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(limitsConfiguration.getMin(), limitsConfiguration.getMax());
	}

}
