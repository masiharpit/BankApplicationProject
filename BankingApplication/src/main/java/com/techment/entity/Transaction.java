package com.techment.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {

	@Id
	private long transaction_id;
//	@ManyToOne(cascade=CascadeType.ALL)
//	private Account account;
	private double amount;
	enum transactionType{};
	LocalDate transactionDateAndTime;
//	Account bankAccount;
	enum transactionStatus{};
	private String transactionRemarks;
	
	public Transaction() {
		super();
	}

	public Transaction(long transaction_id, double amount, LocalDate transactionDateAndTime,
			String transactionRemarks) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.transactionDateAndTime = transactionDateAndTime;
//		this.bankAccount = bankAccount;
		this.transactionRemarks = transactionRemarks;
	}

	public long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
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

//	public Account getBankAccount() {
//		return bankAccount;
//	}
//
//	public void setBankAccount(Account bankAccount) {
//		this.bankAccount = bankAccount;
//	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
	
	
}
