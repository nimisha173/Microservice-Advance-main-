package com.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hai")
public class HelloController {
    @GetMapping("/h1")
    public String hai(){
        return "hello";
    }
}
