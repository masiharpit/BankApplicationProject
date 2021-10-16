package com.techment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin5")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  long adminId;
	private String adminName;
	private String adminContact;
	private String adminEmailId;
	
   
    @OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "branch_id", nullable = false)
    private Branch branch_id;
    
	
	public Admin() {
		super();
	}

	public Admin(long adminId, String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
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

	public Branch getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}

	public Admin(long adminId, String adminName, String adminContact, String adminEmailId, Branch branch_id) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
		this.branch_id = branch_id;
	}

	
	
	
	
	
}
