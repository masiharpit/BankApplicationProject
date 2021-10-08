package com.techment.dto;

import java.time.LocalDate;

import com.techment.entity.Account;

public class TransactionDto {

	private long transaction_id;
	private long account_id;
	private double amount;
	enum transactionType{};
	LocalDate transactionDateAndTime;
	Account bankAccount;
	enum transactionStatus{};
	private String transactionRemarks;
	
	public TransactionDto() {
		super();
	}

	public TransactionDto(long transaction_id, long account_id, double amount, LocalDate transactionDateAndTime,
			Account bankAccount, String transactionRemarks) {
		super();
		this.transaction_id = transaction_id;
		this.account_id = account_id;
		this.amount = amount;
		this.transactionDateAndTime = transactionDateAndTime;
		this.bankAccount = bankAccount;
		this.transactionRemarks = transactionRemarks;
	}

	public TransactionDto(long account_id, double amount, LocalDate transactionDateAndTime, Account bankAccount,
			String transactionRemarks) {
		super();
		this.account_id = account_id;
		this.amount = amount;
		this.transactionDateAndTime = transactionDateAndTime;
		this.bankAccount = bankAccount;
		this.transactionRemarks = transactionRemarks;
	}

	public long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getTransactionDateAndTime() {
		return transactionDateAndTime;
	}

	public void setTransactionDateAndTime(LocalDate transactionDateAndTime) {
		this.transactionDateAndTime = transactionDateAndTime;
	}

	public Account getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Account bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
	
	
}
