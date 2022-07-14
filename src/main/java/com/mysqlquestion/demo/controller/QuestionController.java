package com.mysqlquestion.demo.controller;

import com.mysqlquestion.demo.beans.HttpResponse;
import com.mysqlquestion.demo.common.Constans;
import com.mysqlquestion.demo.dao.entity.Question;
import com.mysqlquestion.demo.service.QuestionService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    private final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @ResponseBody
    @RequestMapping(value="/showquestion")
    public HttpResponse showquestion(@RequestBody Map<String,String> questionpost){
        HttpResponse httpResponse=new HttpResponse();
        String id=questionpost.get("id");
        try {
            Question resultquestion=questionService.searchQuestionById(id);
            if(resultquestion==null){
                httpResponse.setCode(Constans.EXIST_CODE);
                httpResponse.setData(null);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            else{
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(resultquestion);
                httpResponse.setMessage(Constans.STATUS_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            httpResponse.setCode(Constans.EXIST_CODE);
            httpResponse.setMessage(Constans.EXIST_MESSAGE);
        }
        return httpResponse;
    }

    @ResponseBody
    @RequestMapping(value="/test1")
    public String test(@RequestBody Map<String,String> questionpost){
        HttpResponse httpResponse=new HttpResponse();
        String id=questionpost.get("id");
        Question questioncurrent=questionService.searchQuestionById(id);
        return questioncurrent.getId();
//        try {
//            Question resultquestion=questionService.searchQuestionById(id);
//            System.out.println("1111111"+resultquestion.getTitle());
//            if(resultquestion==null){
//                httpResponse.setCode(Constans.EXIST_CODE);
//                httpResponse.setData(null);
//                httpResponse.setMessage(Constans.EXIST_MESSAGE);
//            }
//            else{
//                httpResponse.setCode(Constans.SUCCESS_CODE);
//                httpResponse.setData(resultquestion);
//                httpResponse.setMessage(Constans.STATUS_MESSAGE);
//            }
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//            httpResponse.setCode(Constans.EXIST_CODE);
//            httpResponse.setMessage(Constans.EXIST_MESSAGE);
//        }
//        return httpResponse;
    }

}
