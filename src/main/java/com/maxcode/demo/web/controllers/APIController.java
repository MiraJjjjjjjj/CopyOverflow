package com.maxcode.demo.web.controllers;

import java.io.IOException;

import javax.validation.Valid;

import com.maxcode.demo.web.model.JsonResponse;
import com.maxcode.demo.web.model.QuestionRequest;
import com.maxcode.demo.web.services.StackExchangeApiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    private static final Logger LOG = LoggerFactory.getLogger(APIController.class);

    @Autowired
    StackExchangeApiService stackExchangeApiService;

    @CrossOrigin
    @GetMapping("/api/questions")
    @SuppressWarnings("rawtypes")
    public @ResponseBody ResponseEntity getQuestions(@Valid QuestionRequest request, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            LOG.info("/api/questions - Invalid request recieved");

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(JsonResponse.failure(400, "Invalid parameters", bindingResult.getAllErrors()));
        } else {
            LOG.info("/api/questions - Handling the request");

            try {
                return stackExchangeApiService.getQuestions(request);
            } catch (IOException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(JsonResponse.failure(500, "Exception caught", e.getStackTrace()));
            }
        }

    }   

}