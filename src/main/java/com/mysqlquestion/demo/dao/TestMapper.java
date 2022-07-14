package com.mysqlquestion.demo.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
@DS("test")
public interface TestMapper {
    //查找做题结果
    List<Map<String,String>> resultSearch();

    //查找做题结果（查询版）
    List<Map<String,String>> resultSearchselect(String sql);

    //删除user表
    int dropTableUser();

    //创建user表
    int createTableUser();

    //向user表插入数据1
    int insertTableUser1();

    //向user表插入数据2
    int insertTableUser2();

    //向user表插入数据3
    int insertTableUser3();
}
