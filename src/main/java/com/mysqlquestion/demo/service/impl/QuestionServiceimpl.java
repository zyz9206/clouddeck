package com.mysqlquestion.demo.service.impl;

import com.mysqlquestion.demo.dao.QuestionMapper;
import com.mysqlquestion.demo.dao.entity.Question;
import com.mysqlquestion.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("questionService")
public class QuestionServiceimpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public Question searchQuestionById(String id){
        Question currentQuestion=questionMapper.searchQuestionById(id);
        return currentQuestion;
    }
}
