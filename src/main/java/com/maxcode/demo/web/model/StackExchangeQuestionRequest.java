package com.maxcode.demo.web.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import com.maxcode.demo.util.Constants;

public class StackExchangeQuestionRequest {

    @NotNull
    private String order;

    @NotNull
    private String sort;
    
    @NotNull
    private String site;
    
    private String toDate;
    private String fromDate;
    private String tagged;

    
    public StackExchangeQuestionRequest(String order, String sort, String site, String toDate, String fromDate, String tagged) {
        this.order = order;
        this.sort = sort;
        this.site = site;
        this.toDate = toDate;
        this.fromDate = fromDate;
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

    public String getSite() {
        return this.site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getTagged() {
        return this.tagged;
    }

    public void setTagged(String tagged) {
        this.tagged = tagged;
    }
    public HashMap<String, String> toHashMap() {
        HashMap<String, String> questionsHashMap = new HashMap<>();
        
        if (fromDate != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_FROM_DATE, fromDate);
        }

        if (toDate != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_TO_DATE, toDate);
        }

        if (site != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_SITE, site);
        }

        if (order != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_ORDER, order);
        }

        if (sort != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_SORT, sort);
        }

        if (tagged != null) {
            questionsHashMap.put(Constants.STACK_EXCHANGE_PARAM_TAGGED, tagged);
        }
        
        return questionsHashMap;
    }
}