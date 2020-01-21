package com.wildcodeschool.livecoding20200114;

import org.junit.jupiter.api.Test;

import com.wildcodeschool.livecoding20200114.controller.injectiontypes.GreetingControllerWithConstructorInjection;
import com.wildcodeschool.livecoding20200114.service.GreetingServiceEn;

public class GreetingControllerWithConstructorInjectionTest {

	@Test
	public void greet() {
		GreetingControllerWithConstructorInjection testee = new GreetingControllerWithConstructorInjection(
				new GreetingServiceEn());
		System.out.println(testee.greet());
	}

}
