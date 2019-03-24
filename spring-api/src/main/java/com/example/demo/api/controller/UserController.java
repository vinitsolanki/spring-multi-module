package com.example.demo.api.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser() {
        return userService.getUser();
    }
}
