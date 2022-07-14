package com.mysqlquestion.demo.dao.entity;

public class User {
    private String id;

    private String username;

    private String password;

    private int Question_1;

    private int Question_2;

    private int Question_3;

    private int Question_4;

    private int Question_5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuestion_1() {
        return Question_1;
    }

    public int getQuestion_2() {
        return Question_2;
    }

    public int getQuestion_3() {
        return Question_3;
    }

    public int getQuestion_4() {
        return Question_4;
    }

    public int getQuestion_5() {
        return Question_5;
    }

    public String getUser_name() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_name(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQuestion_1(int question_1) {
        Question_1 = question_1;
    }

    public void setQuestion_2(int question_2) {
        Question_2 = question_2;
    }

    public void setQuestion_3(int question_3) {
        Question_3 = question_3;
    }

    public void setQuestion_4(int question_4) {
        Question_4 = question_4;
    }

    public void setQuestion_5(int question_5) {
        Question_5 = question_5;
    }

}
