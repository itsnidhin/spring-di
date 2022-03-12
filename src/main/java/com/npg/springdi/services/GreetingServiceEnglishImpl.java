package com.npg.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("greetingServiceEnglishImpl")
@Service
public class GreetingServiceEnglishImpl implements GrettingService {

    @Override
    public String getGreeting() {
        return "Hello World";
    }
    
}
