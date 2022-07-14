package com.mysqlquestion.demo.service;

import com.mysqlquestion.demo.dao.entity.Question;

public interface QuestionService {
    /**
     * 根据问题标识获取问题详情
     * @param id
     * @return
     */
    public Question searchQuestionById(String id);

}
