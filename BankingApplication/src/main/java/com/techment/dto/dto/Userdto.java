package com.techment.dto;

public class Userdto {
	
	Long userId;
	 String password;
	 
	 
	public Userdto(Long userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	public Userdto() {
		super();
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
