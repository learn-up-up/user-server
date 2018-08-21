package com.bgs.mylove.userserver.controller;

import com.bgs.mylove.userserver.entity.User;
import com.bgs.mylove.api.base.PageBean;
import com.bgs.mylove.api.base.ResultBean;
import com.bgs.mylove.userserver.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    Logger logger = LoggerFactory.getLogger(UserController.class);
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @GetMapping("/login")
    public String login() {
        logger.info("get into login");
        return "hello word";
    }

//    @ResponseBody
    @GetMapping("/signup")
    public ResultBean<String> signUp(User user) {
        return new ResultBean<>(userService.createOne(user)) ;
    }

    @GetMapping("/queryByPhone")
    public ResultBean<PageBean<User>> queryByPhone(String phone) {
        return new ResultBean<>(userService.queryByPhone(phone)) ;
    }
}
