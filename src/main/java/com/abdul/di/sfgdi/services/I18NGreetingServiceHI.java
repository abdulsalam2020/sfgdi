package com.abdul.di.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI"})
@Service("greetingService")
public class I18NGreetingServiceHI implements GreetingService{
    @Override
    public String sendGreeting() {
        return "Swagat Hai Aapka";
    }
}
