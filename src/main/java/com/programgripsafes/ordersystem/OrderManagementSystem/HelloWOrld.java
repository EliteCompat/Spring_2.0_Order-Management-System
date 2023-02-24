package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrld {

    TextWriter text;

    public HelloWOrld(){
    text = new FancyWriter();

    }

    @RequestMapping ("/")
    public String index() {
        return text.WriteText("hi!");
    }
}
