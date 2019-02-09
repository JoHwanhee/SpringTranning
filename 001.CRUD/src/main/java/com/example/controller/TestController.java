package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home(){
        return "asdf";
    }
    @RequestMapping("/greeting")
    public String test() {
        return "Hello World";
    }

}
