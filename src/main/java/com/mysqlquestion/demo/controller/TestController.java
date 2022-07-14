package com.mysqlquestion.demo.controller;


import com.mysqlquestion.demo.beans.HttpResponse;
import com.mysqlquestion.demo.common.Constans;
import com.mysqlquestion.demo.service.AnswerService;
import com.mysqlquestion.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    TestService testService;

    @Autowired
    AnswerService answerService;

    @ResponseBody
    @RequestMapping(value="/questiontest")
    public String question(){
        List<Map<String,String>> result;
        result=testService.resultSearch();
        String res=new String();
        for(Map<String,String> m:result){
            res+=m.get("name");
        }
        return res;
    }
    //载入环境
    @ResponseBody
    @RequestMapping(value="/loadenvironment")
    public HttpResponse load(@RequestBody Map<String, Integer> questionpost){
        HttpResponse httpResponse=new HttpResponse();
        int id=questionpost.get("id");
        int a=1;
        if(id==1){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
        }
        else if(id==2){
            a=testService.dropTableUser();
        }
        else if(id==3){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
            a*=testService.insertTableUser1();
        }
        else if(id==4){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
            a*=testService.insertTableUser1();
        }
        else if(id==5){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
            a*=testService.insertTableUser1();
        }
        else if(id==6){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
            a*=testService.insertTableUser1();
        }
        else if(id==7){
            a*=testService.dropTableUser();
            a*=testService.createTableUser();
            a*=testService.insertTableUser1();
        }
        if(a==1){
            httpResponse.setMessage(Constans.ADD_MESSAGE);
            httpResponse.setData(1);
            httpResponse.setCode(Constans.SUCCESS_CODE);
        }
        else{
            httpResponse.setMessage(Constans.EXIST_MESSAGE);
            httpResponse.setData(null);
            httpResponse.setCode(Constans.EXIST_CODE);
        }
        return httpResponse;
    }
    //判题逻辑
    @ResponseBody
    @RequestMapping(value="/compareresult")
    public HttpResponse compare(@RequestBody Map<String, Object> questionpost){
        HttpResponse httpResponse=new HttpResponse();
        int id=(int)questionpost.get("id");
        List<Map<String,String>> answer;
        List<Map<String,String>> result;
        result=testService.resultSearch();
        if(id==1){
            answer=answerService.answerOne();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==2){
            answer=answerService.answerTwo();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==3){
            answer=answerService.answerThree();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==4){
            answer=answerService.answerFour();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==5){
            answer=answerService.answerFive();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==6){
            String sql=(String)questionpost.get("sqlselect");
            result=testService.resultSearchselect(sql);
            answer=answerService.answerSix();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        else if(id==7){
            String sql=(String)questionpost.get("sqlselect");
            result=testService.resultSearchselect(sql);
            answer=answerService.answerSeven();
            if(answer==null){
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            }
            if(result.equals(answer)){
                httpResponse.setCode(Constans.SUCCESS_CODE);
                httpResponse.setData(1);
                httpResponse.setMessage(Constans.MAKE_MESSAGE);
            }
            else{
                httpResponse.setCode(Constans.WRONG_CODE);
                httpResponse.setData(0);
                httpResponse.setMessage(Constans.WRONG_MESSAGE);
            }
        }
        return httpResponse;
    }
}
