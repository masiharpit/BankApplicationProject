package com.techment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User5")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String password;	
	 
	 @OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="adminId", referencedColumnName = "adminId")
	 private Admin admin;
	
		public User(Long userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
		public User() {
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


