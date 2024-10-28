package com.ocms.responsehandeler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalResponseHandler {
	
	public static ResponseEntity<Object> createResponse(Object object,HttpStatus httpStatus,String message){
		Map<String, Object> response=new HashMap<>();
		response.put("response", object);
		response.put("message", message);
		response.put("httpststus", httpStatus);
		return new ResponseEntity<Object>(response,httpStatus);
	}
	
	public static ResponseEntity<Object> createResponse(HttpStatus httpStatus,String message){
		Map<String, Object> response=new HashMap<>();
		response.put("message", message);
		response.put("httpststus", httpStatus);
		return new ResponseEntity<Object>(response,httpStatus);
	}

}
