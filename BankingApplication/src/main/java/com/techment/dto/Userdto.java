package com.techment.dto;

public class Userdto {
	
	 Long userId;
	 String password;
	 String name;
	 String role;
	 String token;
	 
	 
	 
	 
	public Userdto(String password, String name, String role, String token) {
		super();
		this.password = password;
		this.name = name;
		this.role = role;
		this.token = token;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	 
	 
}
