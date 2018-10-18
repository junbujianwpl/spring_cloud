package com.study.controller.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/saveUser")
    public String saveUser(User user) {

        service.save(user);
        return "save user successful";
    }
}
