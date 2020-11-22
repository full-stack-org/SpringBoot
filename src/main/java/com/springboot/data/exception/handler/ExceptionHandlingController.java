package com.springboot.data.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlingController {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ProductNotFoundException foundException,
			WebRequest webRequest) {
		ExceptionDetails exceptionDetails = new ExceptionDetails();
		exceptionDetails.setLocalDateTime(LocalDateTime.now());
		exceptionDetails.setMessage(foundException.getMessage());
		exceptionDetails.setDetails(webRequest.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception, WebRequest webRequest) {
		ExceptionDetails exceptionDetails = new ExceptionDetails();
		exceptionDetails.setLocalDateTime(LocalDateTime.now());
		exceptionDetails.setMessage(exception.getMessage());
		exceptionDetails.setDetails(webRequest.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
