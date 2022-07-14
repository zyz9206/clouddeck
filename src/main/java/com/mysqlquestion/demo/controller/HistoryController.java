package com.mysqlquestion.demo.controller;

import com.mysqlquestion.demo.beans.HttpResponse;
import com.mysqlquestion.demo.common.Constans;
import com.mysqlquestion.demo.dao.entity.History;
import com.mysqlquestion.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class HistoryController {
    @Autowired
    HistoryService historyService;

    @ResponseBody
    @RequestMapping("/history")
    public String history(){
        List<Map<String,Object>> resultlist=historyService.searchHistoryByuserId("1");
        String result=new String();
        for(int i=0;i<resultlist.size();i++){
            Map<String,Object> temp=resultlist.get(i);
            result+=temp.get("user_id");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("/historysearch")
    public HttpResponse addHistory(@RequestBody Map<String ,String> user){
        String id=user.get("id");
        HttpResponse httpResponse=new HttpResponse();
        List<Map<String,Object>> historyMap;
        historyMap=historyService.searchHistoryByuserId(id);
        if(historyMap!=null){
            httpResponse.setData(historyMap);
            httpResponse.setCode(Constans.SUCCESS_CODE);
            httpResponse.setCode(Constans.STATUS_MESSAGE);
        }
        else{
            httpResponse.setData(null);
            httpResponse.setMessage(Constans.SEARCH_ERROR_NULL);
            httpResponse.setCode(Constans.EXIST_CODE);
        }
        return httpResponse;
    }

    @ResponseBody
    @RequestMapping(value="/uploadhistory")
    public int uploadCommit(@RequestBody Map<String,Object> record){
        historyService.uploadCommit(record);
        return 1;
    }
}
