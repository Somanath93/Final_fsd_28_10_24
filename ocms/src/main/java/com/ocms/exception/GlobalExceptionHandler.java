package com.ocms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ocms.responsehandeler.GlobalResponseHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> productNotFoundForUserId(NotFoundException ex) {
		return GlobalResponseHandler.createResponse(HttpStatus.NOT_FOUND, ex.getMessage());
	}

}
