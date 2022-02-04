package com.xinz.retool.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Get from Backend!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Post from Backend," +name;
    }
}
