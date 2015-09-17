package com.codeMinion.service.service;

import org.springframework.stereotype.Service;

import com.codeMinion.service.model.SampleResponse;

@Service
public class SampleService {

	public SampleResponse sayHello(String message) {
		return new SampleResponse("hello " + message, "SUCCESS");
	}

}
