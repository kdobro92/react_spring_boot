package com.example.fifaonline.service;

import com.example.fifaonline.dto.AuthVo;
import com.example.fifaonline.mapper.AuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    AuthMapper authMapper;

    public int createUser(AuthVo authVo) {
        int result = 0;
        result = authMapper.createUser(authVo);
        return result;
    }
}
