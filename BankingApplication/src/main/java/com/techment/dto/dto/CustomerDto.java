package com.techment.dto;

import java.util.List;

import java.util.Set;

import com.techment.entity.Customer;


public class CustomerDto {
	   long customerId;
	   String customerName;
	   String phoneNo;
	   String emailID;
	   int age;
	   enum gender{female,male};
	  // Set<Account> account;
	   
	   
	
public CustomerDto(long customerId, String customerName, String phoneNo, String emailID, int age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
		this.age = age;
	}
	
	public CustomerDto(long customerId, String customerName, String phoneNo, String emailID) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
		
	}
	
	public CustomerDto(long customerId, String customerName, String phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		
		
	}
	
	public CustomerDto() {
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
//
//	public Set<Account> getAccount() {
//		return account;
//	}
//
//	public void setAccount(List<Account> account) {
//		this.account = account;
//	}

	public static void save(CustomerDto customerdto) {
		// TODO Auto-generated method stub
		
	}
	
}

	
	
	

