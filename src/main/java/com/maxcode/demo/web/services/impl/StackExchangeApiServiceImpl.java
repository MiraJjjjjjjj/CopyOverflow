package com.maxcode.demo.web.services.impl;

import java.io.IOException;

import com.google.gson.Gson;
import com.maxcode.demo.stackexchange.api.client.StackExchangeApi;
import com.maxcode.demo.stackexchange.api.client.UriBuilder;
import com.maxcode.demo.util.Constants;
import com.maxcode.demo.util.StackExchangeApiUtils;
import com.maxcode.demo.web.model.JsonResponse;
import com.maxcode.demo.web.model.StackExchangeQuestionResponse;
import com.maxcode.demo.web.model.QuestionRequest;
import com.maxcode.demo.web.model.StackExchangeQuestionRequest;
import com.maxcode.demo.web.services.StackExchangeApiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StackExchangeApiServiceImpl implements StackExchangeApiService {
	
	private static final Logger LOG = LoggerFactory.getLogger(StackExchangeApiServiceImpl.class);
	private Gson gson = new Gson();

	@Override
	@SuppressWarnings("rawtypes")
	public ResponseEntity getQuestions(QuestionRequest questionRequest) throws IOException {
		StackExchangeQuestionRequest stackExchangeQuestionRequest = StackExchangeApiUtils.generateQuestionApiRequest(questionRequest);
		String uri = UriBuilder.getApiUri(Constants.METHOD_QUESTIONS, stackExchangeQuestionRequest.toHashMap());

		LOG.info("Fetching request with uri: {}", uri);

		String questionsResponse = StackExchangeApi.getRequest(uri);
		return ResponseEntity.status(HttpStatus.OK)
                .body(JsonResponse.success(gson.fromJson(questionsResponse, StackExchangeQuestionResponse.class)));
	}
}