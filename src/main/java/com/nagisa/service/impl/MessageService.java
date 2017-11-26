package com.nagisa.service.impl;

/**
change content 2
*/
public class MessageService {
	private String message = null;

	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void printMessage() {
		System.out.println(this.message);
	}
}
