package com.mysqlquestion.demo.service.impl;

import com.mysqlquestion.demo.dao.TestMapper;
import com.mysqlquestion.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("testService")
public class TestServiceimpl implements TestService {
    @Autowired
    TestMapper testMapper;


    @Override
    public List<Map<String, String>> resultSearch() {
        List<Map<String,String>> result = new ArrayList<>();
        result=testMapper.resultSearch();
        return result;
    }

    @Override
    public List<Map<String, String>> resultSearchselect(String sql) {
        List<Map<String,String>> result = new ArrayList<>();
        result=testMapper.resultSearchselect(sql);
        return result;
    }

    @Override
    public int dropTableUser(){
        testMapper.dropTableUser();
        return 1;
    }

    @Override
    public int createTableUser() {
        testMapper.createTableUser();
        return 1;
    }

    @Override
    public int insertTableUser1() {
        testMapper.insertTableUser1();
        return 1;
    }

    @Override
    public int insertTableUser2() {
        return 1;
    }

    @Override
    public int insertTableUser3() {
        return 1;
    }
}
