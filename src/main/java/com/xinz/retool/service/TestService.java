package com.xinz.retool.service;

import com.xinz.retool.entity.Test;
import com.xinz.retool.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }


}
