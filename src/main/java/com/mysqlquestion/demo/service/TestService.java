package com.mysqlquestion.demo.service;

import com.mysqlquestion.demo.dao.entity.User;

import java.util.List;
import java.util.Map;

public interface TestService {
    /**
     * 查询做题结果
     * @return
     */
    List<Map<String,String>> resultSearch();
    /**
     * 查询做题结果(查询版本)
     * @return
     */
    List<Map<String,String>> resultSearchselect(String sql);
    /**
     * 删除对应user表
     * @return int
     */
    int dropTableUser();
    /**
     * 创建user表
     * @return int
     */
    int createTableUser();
    /**
     * 向user表中插入数据
     * @return int
     */
    int insertTableUser1();
    /**
     * 创建user表
     * @return int
     */
    int insertTableUser2();
    /**
     * 创建user表
     * @return int
     */
    int insertTableUser3();

}
