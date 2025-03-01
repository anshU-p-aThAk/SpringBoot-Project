package com.first.intro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public void printHello(){
        System.out.println("hello");
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


}