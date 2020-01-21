package com.wildcodeschool.livecoding20200114;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wildcodeschool.livecoding20200114.controller.injectiontypes.GreetingControllerWithSetterInjection;
import com.wildcodeschool.livecoding20200114.service.GreetingServiceEn;

public class GreetingControllerWithSetterInjectionTest {

	@Test
	public void greet() {
		GreetingControllerWithSetterInjection testee = new GreetingControllerWithSetterInjection();
		testee.setGreetingService(new GreetingServiceEn());
		assertEquals("Hello, how are you doing?", testee.greet());
	}

}
