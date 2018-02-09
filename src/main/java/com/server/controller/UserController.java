package com.server.controller;

import com.server.bean.User;
import com.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST}) @ResponseBody
    public User hello(){
        return userService.selectByPrimaryKey(1);
    }


}
