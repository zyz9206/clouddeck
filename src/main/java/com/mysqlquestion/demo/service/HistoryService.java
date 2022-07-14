package com.mysqlquestion.demo.service;

import java.util.List;
import java.util.Map;

public interface HistoryService {
    /**
     * 查询对应用户的所有提交记录
     * @param id
     * @return
     */
    List<Map<String,Object>> searchHistoryByuserId(String id);

    /**
     * 查询全部用户提交记录
     * @return
     */
    List<Map<String,Object>> searchHistoryAll();
    /**
     * 上传历史记录
     * @return int
     */
    int uploadCommit(Map<String,Object> record);
}
