package com.mysqlquestion.demo.service.impl;

import com.mysqlquestion.demo.dao.AnswerMapper;
import com.mysqlquestion.demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("answerService")
public class AnswerServiceimpl implements AnswerService {
    @Autowired
    AnswerMapper answerMapper;

    @Override
    public List<Map<String, String>> answerOne() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerOne();
        return result;
    }

    @Override
    public List<Map<String, String>> answerTwo() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerTwo();
        return result;
    }

    @Override
    public List<Map<String, String>> answerThree() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerThree();
        return result;
    }

    @Override
    public List<Map<String, String>> answerFour() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerFour();
        return result;
    }

    @Override
    public List<Map<String, String>> answerFive() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerFive();
        return result;
    }

    @Override
    public List<Map<String, String>> answerSix() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerSix();
        return result;
    }

    @Override
    public List<Map<String, String>> answerSeven() {
        List<Map<String, String>> result=new ArrayList<>();
        result=answerMapper.answerSeven();
        return result;
    }
}
