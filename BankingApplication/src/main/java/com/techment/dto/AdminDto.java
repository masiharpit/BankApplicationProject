package com.techment.dto;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.techment.entity.Branch;

public class AdminDto {
	
	 private long adminId;
	private String adminName;
	private String adminContact;
	private String adminEmailId;
	private Branch branch;
	

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

	
	
	

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	

	public AdminDto(long adminId, String adminName, String adminContact, String adminEmailId, Branch branch) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
		this.branch = branch;
	}

	public AdminDto(long adminId, String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}




	
	
	
	
	 

}
