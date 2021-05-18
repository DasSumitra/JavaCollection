package com.test.exception;

public class MyExceptionTest extends RuntimeException{
	private String message;
	private int code;

	public MyExceptionTest(String message) {
		this.message = message;
	}
	

	public MyExceptionTest(int code) {
		this.code = code;
	}


	public MyExceptionTest(String message, int code) {
		this.message = message;
		this.code = code;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}
	
	

}
