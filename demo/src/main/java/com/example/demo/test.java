package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Bdasdsadadoot 2!22222";
    }

}
