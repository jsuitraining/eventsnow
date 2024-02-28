package com.experiments.eventsnow;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {




    @Value("${spring.messages}")
     public String message;
    @GetMapping("/info")
    public String getWelcomeNotes(){
        return message;
    }
}
