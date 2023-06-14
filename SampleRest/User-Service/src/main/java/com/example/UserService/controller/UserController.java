package com.example.UserService.controller;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserService;
import com.example.UserService.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUesr of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("{/id}")
    public ResponseTemplateVO getUserWithDept(@PathVariable("id") Long uid){
        log.info("inside getUserWithDept of UserController");
        return userService.getUserWithDepartment(uid);
    }
}
