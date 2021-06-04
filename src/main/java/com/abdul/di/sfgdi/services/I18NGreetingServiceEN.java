package com.abdul.di.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("greetingService")
public class I18NGreetingServiceEN implements GreetingService {
    @Override
    public String sendGreeting() {
        return "Welcome Friends...";
    }
}
