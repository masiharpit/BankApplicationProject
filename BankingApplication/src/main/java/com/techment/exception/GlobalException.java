package com.techment.exception;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = ValidationException.class)
	public ResponseEntity<List<String>> myValidation(ValidationException exception)
	{
		return new ResponseEntity<List<String>>(exception.getMessages(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<String> myException(IdNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.NOT_FOUND);
	}		
	
	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<String> myException(ResourceNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.NOT_FOUND);
	}
	
	
	
}
