package com.wildcodeschool.livecoding20200114.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Profile("de")
public class GreetingServiceDe implements GreetingService {

	public String greet() {
		return "Guten Tag, wie geht es Ihnen?";
	}

}
