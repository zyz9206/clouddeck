package com.mysqlquestion.demo.service.impl;

import com.mysqlquestion.demo.dao.HistoryMapper;
import com.mysqlquestion.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("historyService")
public class HistoryServiceimpl implements HistoryService {
    @Autowired
    HistoryMapper historyMapper;

    @Override
    public List<Map<String, Object>> searchHistoryByuserId(String id) {
        List<Map<String,Object>> result=new ArrayList<>();
        result=historyMapper.searchHistoryByuserId(id);
        return result;
    }

    @Override
    public List<Map<String, Object>> searchHistoryAll() {
        List<Map<String,Object>> result=new ArrayList<>();
        result=historyMapper.searchHistoryAll();
        return result;
    }

    @Override
    public int uploadCommit(Map<String, Object> record) {
        historyMapper.uploadCommit(record);
        return 1;
    }
}
