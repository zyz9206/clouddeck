package com.mysqlquestion.demo.controller;

import com.mysqlquestion.demo.beans.HttpResponse;
import com.mysqlquestion.demo.common.Constans;
import com.mysqlquestion.demo.dao.entity.User;
import com.mysqlquestion.demo.service.QuestionService;
import com.mysqlquestion.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/usertest")
    public String search(){
        List<User> result;
        result=userService.searchforallUser();
        String resultid="x";
        for(User u:result){
            if(u.getUser_name().equals("root")){
                resultid=u.getId();
                break;
            }
        }
        return resultid;
    }

    @ResponseBody
    @RequestMapping(value="/userlogin")
    public HttpResponse userlogin(@RequestBody Map<String,String> userinfo){
        HttpResponse httpResponse=new HttpResponse();
        String username=userinfo.get("username");
        String password=userinfo.get("password");
        List<User> result=userService.searchforallUser();
        Boolean hasUser=false;
        for(User u:result){
            if(u.getUser_name().equals(username)){
                hasUser=true;
                if(u.getPassword().equals(password)){
                    httpResponse.setMessage(Constans.STATUS_MESSAGE);
                    httpResponse.setCode(Constans.SUCCESS_CODE);
                    httpResponse.setData(u);
                }
                else{
                    httpResponse.setMessage(Constans.WRONG_MESSAGE);
                    httpResponse.setCode(Constans.EXIST_CODE);
                    httpResponse.setData(null);
                }
                break;
            }
        }
        if(hasUser==false){
            httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            httpResponse.setCode(Constans.EXIST_CODE);
            httpResponse.setData(null);
        }
        return httpResponse;
    }
}
