package com.mysqlquestion.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AnswerMapper {
    /**
     * 查询对应题目答案
     * @return
     */
    public List<Map<String,String >> answerOne();

    public List<Map<String,String >> answerTwo();

    public List<Map<String,String >> answerThree();

    public List<Map<String,String >> answerFour();

    public List<Map<String,String >> answerFive();

    public List<Map<String,String >> answerSix();

    public List<Map<String,String >> answerSeven();
}
