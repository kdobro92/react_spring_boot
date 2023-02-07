package com.example.fifaonline.controller;

import com.example.fifaonline.dto.AuthVo;
import com.example.fifaonline.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class AuthController {
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    AuthService authService;
    @PostMapping("/signup")
    public int signup(AuthVo authVo) {
        int result = 0;

        try {
            result = authService.createUser(authVo);
            log.info("");

        } catch (Exception e) {
            log.error("");
        }

        return result;
    }
}
