package com.techment.dto;

public class Admindto {
	
	Long id;
	 String name;
	 String contact;
	 String email;
	 
	 
	 
	public Admindto() {
		super();
	}
	public Admindto(Long id, String name, String contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 

}
