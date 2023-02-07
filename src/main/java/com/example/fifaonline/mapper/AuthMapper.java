package com.example.fifaonline.mapper;

import com.example.fifaonline.dto.AuthVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuthMapper {

    int createUser(AuthVo authVo);

    int loginUser(AuthVo authVo);
}
