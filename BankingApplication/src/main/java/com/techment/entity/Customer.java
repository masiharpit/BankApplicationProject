package com.techment.entity;

//import java.util.List;
//import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   long customerId;
   String customerName;
   String phoneNo;
   String emailID;
   int age;
   enum gender{female,male};
  //Set<Account> account;
  
   



public Customer(long customerId, String customerName, String phoneNo, String emailID, int age) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.phoneNo = phoneNo;
	this.emailID = emailID;
	this.age = age;
	//this.account = account;
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


//public Set<Account> getAccount() {
//	return account;
//}
//
//
//public void setAccount(Set<Account> account) {
//	this.account = account;
//}




   
}
