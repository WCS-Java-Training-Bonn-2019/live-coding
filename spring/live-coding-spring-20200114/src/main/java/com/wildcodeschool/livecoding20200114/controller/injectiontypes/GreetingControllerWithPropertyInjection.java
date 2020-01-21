package com.wildcodeschool.livecoding20200114.controller.injectiontypes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.livecoding20200114.service.GreetingService;

//@Controller
public class GreetingControllerWithPropertyInjection {

	public GreetingService greetingService;

	@GetMapping("/greeting2")
	@ResponseBody
	public String greet() {
		return greetingService.greet();
	}

}
