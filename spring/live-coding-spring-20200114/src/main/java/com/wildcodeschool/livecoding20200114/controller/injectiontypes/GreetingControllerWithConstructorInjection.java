package com.wildcodeschool.livecoding20200114.controller.injectiontypes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.livecoding20200114.service.GreetingService;

//@Controller
public class GreetingControllerWithConstructorInjection {

	private final GreetingService greetingService;

	public GreetingControllerWithConstructorInjection(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	@GetMapping("/greeting1")
	@ResponseBody
	public String greet() {
		return greetingService.greet();
	}

}
