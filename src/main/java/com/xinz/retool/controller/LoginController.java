package com.xinz.retool.controller;

import com.xinz.retool.entity.User;
import com.xinz.retool.resp.CommonResp;
import com.xinz.retool.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @Resource
    UserService userService;

    @PostMapping("/user/login")
    public CommonResp handleLogin(@RequestBody User user) {
        CommonResp<List<User>> resp = new CommonResp<>();
        String username = user.getUsername();
        String password = user.getPassword();
        List<User> list = userService.validateLogin(username, password);
        resp.setContent(list);

        LOG.info("Login handled");

        return resp;
    }
}
