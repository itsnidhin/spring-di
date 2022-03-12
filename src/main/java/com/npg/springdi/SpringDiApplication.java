package com.npg.springdi;

import com.npg.springdi.controller.GreetingEnglshController;
import com.npg.springdi.controller.GreetingFrenchController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		

		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		GreetingEnglshController econtroller = (GreetingEnglshController)context.getBean("greetingEnglshController");

		econtroller.getGreeting();

		GreetingFrenchController fcontroller = (GreetingFrenchController)context.getBean("greetingFrenchController");

		fcontroller.getGreeting();
	}

}
