package com.abdul.di.sfgdi.controller;

import com.abdul.di.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController implements GreetingController{

    @Autowired
    private GreetingService greetingService;

    @Override
    public void greet(){
        System.out.println("Msg from PropertyInjected controller - "+greetingService.sendGreeting());
    }
}
