package com.abdul.di.sfgdi.controller;

import com.abdul.di.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController implements GreetingController{

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void greet() {
        System.out.println("Msg from SetterInjectedController - "+ greetingService.sendGreeting());
    }
}
