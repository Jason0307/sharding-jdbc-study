package org.zhubao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhubao.entity.User;
import org.zhubao.mapper.UserMapper;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userMapper.getAllUsers();
    }
}
