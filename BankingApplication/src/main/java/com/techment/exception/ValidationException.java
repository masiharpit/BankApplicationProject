package com.techment.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends RuntimeException {

	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	
	
	List<String> messages = new ArrayList<String>();

	
	
	public ValidationException(List<String> message) {
		super();
		this.messages = message;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	
}
