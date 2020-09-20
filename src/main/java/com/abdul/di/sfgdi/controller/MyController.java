package com.abdul.di.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String sayHello() {
		System.out.println("Welcome to spring MyController");
		return "Hi Folks";
	}

}
