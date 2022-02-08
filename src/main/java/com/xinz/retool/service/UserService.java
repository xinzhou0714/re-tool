package com.xinz.retool.service;

import com.xinz.retool.entity.User;
import com.xinz.retool.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> validateLogin(String username, String password) {
        List<User> res = userMapper.selectByUsernameAndPassword(username, password);
        return res;
    }
}
