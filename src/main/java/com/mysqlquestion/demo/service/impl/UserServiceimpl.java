package com.mysqlquestion.demo.service.impl;

import com.mysqlquestion.demo.dao.UserMapper;
import com.mysqlquestion.demo.dao.entity.User;
import com.mysqlquestion.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> searchforallUser(){
        List<User> result=new ArrayList<>();
        result=userMapper.searchforallUser();
        return result;
    }
}
