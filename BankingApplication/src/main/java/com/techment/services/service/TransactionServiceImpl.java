package com.techment.service;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ITransactionRepository;
import com.techment.entity.Transaction;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private ITransactionRepository repository;

	@Override
	public Transaction createTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		repository.save(transaction);
		return null;
	}

	@Override
	public Transaction viewTransaction(long transaction_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction findTransactionById(long transaction_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Transaction> listAllTransaction(long account_id, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Transaction> getAllMyTransactions(long account_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
