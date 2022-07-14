package com.mysqlquestion.demo.service;

import com.mysqlquestion.demo.dao.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public interface AnswerService {
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
