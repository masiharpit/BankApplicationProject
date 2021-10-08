package com.techment.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account5")
public class Account {
	
	@Id
	long accountId;
	
	@Column(name="interest_Rate")
	double interestRate;
	
	@Column(name="balance")
	double balance;
	
	@Column(name="date_Of_Opening")
	LocalDate dateOfOpening;
	
//@OneToMany(mappedBy = "nomineeId",cascade=CascadeType.ALL)
//	@JoinColumn(name = "nomineeId")
//	List<Nominee> nominee; 
	
	@OneToMany(mappedBy = "beneficiaryId",cascade=CascadeType.ALL)
	List<Beneficiary> beneficiary; 
	
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