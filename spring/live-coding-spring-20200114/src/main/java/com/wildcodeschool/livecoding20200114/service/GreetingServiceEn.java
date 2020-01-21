package com.wildcodeschool.livecoding20200114.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Profile("en")
public class GreetingServiceEn implements GreetingService {

	public String greet() {
		return "Hello, how are you doing?";
	}

}
