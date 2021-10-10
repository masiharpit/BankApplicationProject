package com.techment.exception;

import org.springframework.web.bind.annotation.ResponseStatus;



public class ResourceNotFoundException extends Exception {
 
	String msg = "";

	public ResourceNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
