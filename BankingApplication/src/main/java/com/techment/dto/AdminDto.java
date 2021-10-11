package com.techment.dto;

public class AdminDto {
	
	 private long adminId;
	private String adminName;
	private String adminContact;
	private String adminEmailId;
	 
	 public AdminDto() {
		super();
	}

	 public long getAdminId() {
		return adminId;
	}

    public void setAdminId(long adminId) {
		this.adminId = adminId;
	}


  public String getAdminName() {
		return adminName;
	}

public void setAdminName(String adminName) {
		this.adminName = adminName;
	}





	public String getAdminContact() {
		return adminContact;
	}





	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}





	public String getAdminEmailId() {
		return adminEmailId;
	}





	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}





	public AdminDto(long adminId, String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}
	
	
	
	
	
	 

}
