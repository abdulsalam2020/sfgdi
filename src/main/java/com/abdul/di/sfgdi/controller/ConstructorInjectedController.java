package com.abdul.di.sfgdi.controller;

import com.abdul.di.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController implements GreetingController{

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void greet() {
        System.out.println("Msg from ConstructorInjectedController - "+ greetingService.sendGreeting());
    }
}
