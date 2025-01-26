package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Garimauttam@google.com";
    }
    @RequestMapping("/about")
    public String about(){
        return "I will join google as Software engineer.";
    }
}
