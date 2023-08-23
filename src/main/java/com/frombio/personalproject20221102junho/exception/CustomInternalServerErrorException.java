package com.frombio.personalproject20221102junho.exception;

public class CustomInternalServerErrorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomInternalServerErrorException(String message) {
        super(message);
    }

}
