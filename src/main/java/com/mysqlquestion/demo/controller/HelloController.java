package com.mysqlquestion.demo.controller;


import com.mysqlquestion.demo.dao.entity.Question;
import com.mysqlquestion.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    QuestionService questionService;

    @ResponseBody
    @RequestMapping("/demo")
    public String hello() {
        Question currentquestion=questionService.searchQuestionById("1");
        return currentquestion.getDetail();
    }

}
