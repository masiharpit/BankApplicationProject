package com.techment.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@OneToOne
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long userId;
	 String password;	
	
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


