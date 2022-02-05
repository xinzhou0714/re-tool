package com.xinz.retool.controller;


import com.xinz.retool.entity.Test;
import com.xinz.retool.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Get from Backend!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Post from Backend," +name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
