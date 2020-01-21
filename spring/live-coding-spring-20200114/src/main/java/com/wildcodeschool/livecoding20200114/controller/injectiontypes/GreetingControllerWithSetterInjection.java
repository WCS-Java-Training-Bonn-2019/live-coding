package com.wildcodeschool.livecoding20200114.controller.injectiontypes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.livecoding20200114.service.GreetingService;

//@Controller
public class GreetingControllerWithSetterInjection {

	public GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@GetMapping("/greeting3")
	@ResponseBody
	public String greet() {
		return greetingService.greet();
	}

}
