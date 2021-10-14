package com.techment.entity;

import java.util.List;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.techment.enum_class.Gender;

@Entity
@Table(name="Customer5")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   long customerId;
   String customerName;
   String phoneNo;
   String emailID;
   int age;
   
   @Enumerated(EnumType.ORDINAL)
   private Gender gender; 
   
   
   
//   @OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "accountId")
   
   
   @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name = "accountId")
  
   Account account;
  





public Customer(long customerId, String customerName, String phoneNo, String emailID, int age, Gender gender,
		Account account) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.phoneNo = phoneNo;
	this.emailID = emailID;
	this.age = age;
	this.gender = gender;
	this.account = account;
}


public Customer(long customerId, String customerName, String phoneNo, String emailID, int age) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.phoneNo = phoneNo;
	this.emailID = emailID;
	this.age = age;
	this.account = account;
}


public Customer() {
	super();
}


public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public Gender getGender() {
	return gender;
}


public void setGender(Gender gender) {
	this.gender = gender;
}


public Account getAccount() {
	return account;
}


public void setAccount(Account account) {
	this.account = account;
}


//public Gender getGender() {
//	// TODO Auto-generated method stub
//	return null;
//}



}
