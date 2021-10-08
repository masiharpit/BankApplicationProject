package com.techment.services;

import java.time.LocalDate;
import java.util.Set;

import com.techment.entity.Transaction;

public interface ITransactionService {

	Transaction createTransaction(Transaction transaction);
	Transaction viewTransaction(long transaction_id);
	Transaction findTransactionById(long transaction_id);
	Set<Transaction> listAllTransaction(long account_id, LocalDate from, LocalDate to);
	Set<Transaction> getAllMyTransactions(long account_id);
}
