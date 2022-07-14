package com.mysqlquestion.demo.dao;


import com.mysqlquestion.demo.dao.entity.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    //通过问题编号查找问题具体信息
    public Question searchQuestionById(String id);
}
