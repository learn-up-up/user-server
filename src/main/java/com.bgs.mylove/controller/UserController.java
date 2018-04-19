package com.bgs.mylove.controller;

import com.bgs.mylove.entity.User;
import com.bgs.mylove.result.ResultBean;
import com.bgs.mylove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "hello word";
    }

    @GetMapping("/signup")
    public ResultBean<String> signUp(User user) {
        return new ResultBean<>(userService.createOne(user)) ;
    }
}
