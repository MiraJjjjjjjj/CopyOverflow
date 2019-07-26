package com.maxcode.demo.web.model;

import java.util.ArrayList;

public class Question {

    private ArrayList<String> tags;
    private Owner owner;
    private Boolean is_answered;
    private Integer view_count;
    private String closed_date;
    private Integer answer_count;
    private Integer score;
    private String last_activity_date;
    private Integer question_id;
    private String link;
    private String closed_reason;
    private String title;

    public Question(ArrayList<String> tags, Owner owner, Boolean is_answered, Integer view_count, String closed_date, Integer answer_count, Integer score, String last_activity_date, Integer question_id, String link, String closed_reason, String title) {
        this.tags = tags;
        this.owner = owner;
        this.is_answered = is_answered;
        this.view_count = view_count;
        this.closed_date = closed_date;
        this.answer_count = answer_count;
        this.score = score;
        this.last_activity_date = last_activity_date;
        this.question_id = question_id;
        this.link = link;
        this.closed_reason = closed_reason;
        this.title = title;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean isIs_answered() {
        return this.is_answered;
    }

    public Boolean getIs_answered() {
        return this.is_answered;
    }

    public void setIs_answered(Boolean is_answered) {
        this.is_answered = is_answered;
    }

    public Integer getView_count() {
        return this.view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public String getClosed_date() {
        return this.closed_date;
    }

    public void setClosed_date(String closed_date) {
        this.closed_date = closed_date;
    }

    public Integer getAnswer_count() {
        return this.answer_count;
    }

    public void setAnswer_count(Integer answer_count) {
        this.answer_count = answer_count;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getLast_activity_date() {
        return this.last_activity_date;
    }

    public void setLast_activity_date(String last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public Integer getQuestion_id() {
        return this.question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getClosed_reason() {
        return this.closed_reason;
    }

    public void setClosed_reason(String closed_reason) {
        this.closed_reason = closed_reason;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}