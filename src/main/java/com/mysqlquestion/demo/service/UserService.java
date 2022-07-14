package com.mysqlquestion.demo.service;

import com.mysqlquestion.demo.dao.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 查询全部用户
     * @return
     */
    List<User> searchforallUser();
}
