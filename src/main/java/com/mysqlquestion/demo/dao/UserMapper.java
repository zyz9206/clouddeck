package com.mysqlquestion.demo.dao;

import com.mysqlquestion.demo.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //查询找所有用户信息
    public List<User> searchforallUser();
}
