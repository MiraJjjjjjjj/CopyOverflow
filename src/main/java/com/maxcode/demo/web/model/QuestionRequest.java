package com.maxcode.demo.web.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import com.maxcode.demo.util.Constants;

public class QuestionRequest {

    @NotNull
    private String order;

    @NotNull
    private String sort;
    
    
    private String todate;
    private String fromdate;
    private String tagged;

    
    public QuestionRequest(String order, String sort, String todate, String fromdate, String tagged) {
        this.order = order;
        this.sort = sort;
        this.todate = todate;
        this.fromdate = fromdate;
        this.tagged = tagged;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return this.sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getToDate() {
        return this.todate;
    }

    public void setToDate(String toDate) {
        this.todate = toDate;
    }

    public String getFromDate() {
        return this.fromdate;
    }

    public void setFromDate(String fromDate) {
        this.fromdate = fromDate;
    }

    public String getTagged() {
        return this.tagged;
    }

    public void setTagged(String tagged) {
        this.tagged = tagged;
    }

    public HashMap<String, String> toHashMap() {
        HashMap<String, String> questionsHashMap = new HashMap<>();
        
        if (fromdate != null) {
            questionsHashMap.put(Constants.PARAM_FROM_DATE, fromdate);
        }

        if (todate != null) {
            questionsHashMap.put(Constants.PARAM_TO_DATE, todate);
        }

        if (order != null) {
            questionsHashMap.put(Constants.PARAM_ORDER, order);
        }

        if (sort != null) {
            questionsHashMap.put(Constants.PARAM_SORT, sort);
        }

        if (tagged != null) {
            questionsHashMap.put(Constants.PARAM_TAGGED, tagged);
        }
        
        return questionsHashMap;
    }
}