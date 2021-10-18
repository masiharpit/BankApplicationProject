package com.techment.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.techment.enumClass.AccountType;
import com.techment.entity.Customer;

public class AccountDto {
	
	long accountId;
	double balance;
	AccountType accountType;
	
	

	@Enumerated(EnumType.ORDINAL)
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public AccountDto() {
		super();
	}

	public AccountDto(long accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
