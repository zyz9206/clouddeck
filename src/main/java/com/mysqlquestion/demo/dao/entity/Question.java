package com.mysqlquestion.demo.dao.entity;

import java.util.Map;
import java.util.Objects;

public class Question {
    private String id;

    private String title;

    private String detail;

    private String answer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setDescription(String description) {
        this.detail = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
