package com.wildcodeschool.livecoding20200114.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Profile("fr")
public class GreetingServiceFr implements GreetingService {

	public String greet() {
		return "Bonjour, common ça va?";
	}

}
