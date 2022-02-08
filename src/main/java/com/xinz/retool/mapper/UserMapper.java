package com.xinz.retool.mapper;

import com.xinz.retool.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectByUsernameAndPassword(String username, String password);

}
