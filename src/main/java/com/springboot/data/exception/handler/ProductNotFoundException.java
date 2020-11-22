package com.springboot.data.exception.handler;

public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7992081238799030512L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
