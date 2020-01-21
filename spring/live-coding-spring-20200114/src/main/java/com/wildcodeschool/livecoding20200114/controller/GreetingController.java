package com.wildcodeschool.livecoding20200114.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.livecoding20200114.service.GreetingService;

@Controller
public class GreetingController {

	@Autowired
//	@Qualifier ("greetingServiceFr")
	private GreetingService greetingService;

	@GetMapping("/greeting")
	@ResponseBody
	public String greet() {
		return greetingService.greet();
	}

}
