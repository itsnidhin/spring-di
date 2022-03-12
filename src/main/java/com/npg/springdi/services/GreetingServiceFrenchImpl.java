package com.npg.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier
@Service
public class GreetingServiceFrenchImpl implements GrettingService{

    @Override
    public String getGreeting() {
        // TODO Auto-generated method stub
        return "Bonjour le monde";
    }
    
}
