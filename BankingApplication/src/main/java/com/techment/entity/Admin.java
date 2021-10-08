package com.techment.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@OneToOne
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long adminId;
	 String adminName;
	 String adminContact;
	 String adminEmailId;
	
	
	
	public Admin() {
		super();
	}
	public Admin(Long adminId, String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
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
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
