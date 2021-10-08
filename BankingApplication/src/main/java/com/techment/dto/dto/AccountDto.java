package com.techment.dto;

import java.time.LocalDate;

public class AccountDto {
	
	long accountId;
	double interestRate;
	double balance;
	LocalDate dateOfOpening;
	
	
	
	public AccountDto() {
		super();
	}

	public AccountDto(long accountId, double interestRate, double balance, LocalDate dateOfOpening) {
		super();
		this.accountId = accountId;
		this.interestRate = interestRate;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
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
