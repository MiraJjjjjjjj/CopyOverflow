package com.maxcode.demo.util;

import com.maxcode.demo.web.model.QuestionRequest;
import com.maxcode.demo.web.model.StackExchangeQuestionRequest;

public class StackExchangeApiUtils {

    public static StackExchangeQuestionRequest generateQuestionApiRequest(QuestionRequest questionRequest) {
        return new StackExchangeQuestionRequest(
            questionRequest.getOrder(),
            questionRequest.getSort(),
            Constants.STACK_EXCHANGE_SITE_STACK_OVERFLOW,
            questionRequest.getToDate(),
            questionRequest.getFromDate(),
            questionRequest.getTagged()
        );
    }
}