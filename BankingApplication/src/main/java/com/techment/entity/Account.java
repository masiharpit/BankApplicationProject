package com.techment.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.techment.enumClass.AccountType;


@Entity
@Table(name="account5000")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long accountId;
	
	@Column(name="interest_Rate")
	private double interestRate;
	
	@Column(name="balance")
	private double balance;

	@Column(name="date_Of_Opening")
	private LocalDate dateOfOpening;
	
	private AccountType accountType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId", referencedColumnName = "customerId")
	private Customer customer;
		
//@OneToMany(mappedBy = "nomineeId",cascade=CascadeType.ALL)
//	@JoinColumn(name = "nomineeId")
//	List<Nominee> nominee;
	
	
	
	@Enumerated(EnumType.ORDINAL)
	public AccountType getAccountType() {
		return accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
}