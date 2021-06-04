package com.abdul.di.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	GreetingController greetingController;

	public MyController(@Qualifier("constructorInjectedController") GreetingController greetingController) {
		this.greetingController = greetingController;
	}

	public String sayHello() {
		System.out.println("Welcome to spring MyController");
		greetingController.greet();
		return "Hi Folks";
	}

}
