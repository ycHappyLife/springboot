package com.yc.study.springbootdemo.controller;

import com.yc.study.springbootdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private User user;

    @GetMapping("/hello")
    public User hello() {
        return user;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "GET_USER";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String postUser() {
        return "POST_USER";
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public String deleteUser() {
        return "DELETE_USER";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String putUser() {
        return "PUT_USER";
    }
}
