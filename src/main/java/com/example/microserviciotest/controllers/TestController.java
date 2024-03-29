package com.example.microserviciotest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private final static Logger logger= LoggerFactory.getLogger(TestController.class);
	
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path="/myValue")
	public ResponseEntity<String> index(){
		logger.info("LLamada al endpoint "+this.myValue);
		return new ResponseEntity<String>(HttpStatus.OK).ok(this.myValue);
		
	}

}
