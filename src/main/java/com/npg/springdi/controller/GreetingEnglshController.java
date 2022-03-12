package com.npg.springdi.controller;

import com.npg.springdi.services.GrettingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingEnglshController {

    private final GrettingService service;

    public GreetingEnglshController(@Qualifier("greetingServiceEnglishImpl") GrettingService service) {
        this.service = service;
    }

    public void getGreeting(){
        System.out.println(service.getGreeting());
        
    }
    
    
}
