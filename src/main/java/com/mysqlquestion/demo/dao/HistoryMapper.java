package com.mysqlquestion.demo.dao;

import com.mysqlquestion.demo.dao.entity.History;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HistoryMapper {
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
