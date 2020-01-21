package com.wildcodeschool.livecoding20200114.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wildcodeschool.livecoding20200114.service.GreetingService;
import com.wildcodeschool.livecoding20200114.service.GreetingServiceDe;
import com.wildcodeschool.livecoding20200114.service.GreetingServiceEn;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Profile("en")
	GreetingService greetingServiceEn() {
		return new GreetingServiceEn();
	}

	@Bean
	@Profile("de")
	GreetingService greetingServiceDe() {
		return new GreetingServiceDe();
	}
}
