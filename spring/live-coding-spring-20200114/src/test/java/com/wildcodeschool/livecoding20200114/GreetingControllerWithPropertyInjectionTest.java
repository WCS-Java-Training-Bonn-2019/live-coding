package com.wildcodeschool.livecoding20200114;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wildcodeschool.livecoding20200114.controller.injectiontypes.GreetingControllerWithPropertyInjection;
import com.wildcodeschool.livecoding20200114.service.GreetingServiceEn;

public class GreetingControllerWithPropertyInjectionTest {

	@Test
	public void greet() {
		GreetingControllerWithPropertyInjection testee = new GreetingControllerWithPropertyInjection();
		testee.greetingService = new GreetingServiceEn();
		assertEquals("Hello, how are you doing?", testee.greet());
	}

}
