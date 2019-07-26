package com.maxcode.demo.web.services;

import java.io.IOException;

import com.maxcode.demo.web.model.QuestionRequest;

import org.springframework.http.ResponseEntity;

public interface StackExchangeApiService {

    @SuppressWarnings("rawtypes")
    ResponseEntity getQuestions(QuestionRequest questionsRequest) throws IOException;
}