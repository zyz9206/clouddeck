package com.mysqlquestion.demo.dao.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class History {
    private int id;

    private String user_id;

    private String question_id;

    private Timestamp time;

    private int result;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public int getResult() {
        return result;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
