package com.springmvc_21_02_18.controller;

import com.springmvc_21_02_18.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

}
