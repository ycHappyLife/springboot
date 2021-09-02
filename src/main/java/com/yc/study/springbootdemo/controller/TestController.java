package com.yc.study.springbootdemo.controller;

import com.yc.study.springbootdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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


    @GetMapping("/boss/{id}")
    public Map pathMap(@MatrixVariable("name") String name,
                       @MatrixVariable("age") Integer age,
                       @PathVariable("id") String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        map.put("id", id);
        return map;
    }
}
