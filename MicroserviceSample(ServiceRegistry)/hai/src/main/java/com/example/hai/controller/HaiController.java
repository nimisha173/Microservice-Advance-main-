package com.example.hai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hai")
public class HaiController {
    @GetMapping("/h2")
    public String hai(){
        return "hai works";
    }
}
