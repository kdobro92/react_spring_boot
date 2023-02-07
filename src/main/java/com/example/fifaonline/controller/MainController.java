package com.example.fifaonline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String Main() {
        return "Main Page";
    }
    @PostMapping("/auth/login")
    public String Login() {
        return "Login Page";
    }

    @PostMapping("/auth/signup")
    public String Signup() {
        return "Signup Page";
    }
}
