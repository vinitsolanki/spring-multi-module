package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    public String getUser() {
        System.out.println("Executed getUser()");
        return "Executed";
    }
}
