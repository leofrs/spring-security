package com.leo.springsecutiry.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllers {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
