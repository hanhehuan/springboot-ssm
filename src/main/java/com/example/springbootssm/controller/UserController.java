package com.example.springbootssm.controller;

import com.example.springbootssm.dao.UserMapper;
import com.example.springbootssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "selectUserByName")
    public User selectUserByName() {
        //调用dao层
        User user = userMapper.selectUserByName("beyondLi");
        return user;
    }
}
