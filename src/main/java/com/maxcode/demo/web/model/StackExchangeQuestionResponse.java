package com.maxcode.demo.web.model;

import java.util.ArrayList;

public class StackExchangeQuestionResponse {

    private ArrayList<Question> items;
    private Boolean has_more;
    private Integer quota_max;
    private Integer quota_remaining;

    public StackExchangeQuestionResponse(ArrayList<Question> items, Boolean has_more, Integer quota_max, Integer quota_remaining) {
        this.items = items;
        this.has_more = has_more;
        this.quota_max = quota_max;
        this.quota_remaining = quota_remaining;
    }

    public ArrayList<Question> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Question> items) {
        this.items = items;
    }

    public Boolean isHas_more() {
        return this.has_more;
    }

    public Boolean getHas_more() {
        return this.has_more;
    }

    public void setHas_more(Boolean has_more) {
        this.has_more = has_more;
    }

    public Integer getQuota_max() {
        return this.quota_max;
    }

    public void setQuota_max(Integer quota_max) {
        this.quota_max = quota_max;
    }

    public Integer getQuota_remaining() {
        return this.quota_remaining;
    }

    public void setQuota_remaining(Integer quota_remaining) {
        this.quota_remaining = quota_remaining;
    }
}