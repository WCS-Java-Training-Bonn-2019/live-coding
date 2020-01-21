package com.wildcodeschool.livecoding20200114;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.wildcodeschool.livecoding20200114.controller.GreetingController;

@SpringBootApplication
//@ImportResource("classpath:applicationContext.xml")
public class LiveCoding20200114Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LiveCoding20200114Application.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		System.out.println(controller.greet());
//		GreetingService service = (GreetingService) ctx.getBean("greetingServiceEn");
//		System.out.println("Service: " + service.greet());
	}

}
