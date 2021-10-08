package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.AccountDao;
import com.techment.dto.AccountDto;
import com.techment.entity.Account;

@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	AccountDao dao;
	
	@Override
	public AccountDto transferMoney(long senderAccountId, long receiverAccountId, double amount, String username,
			String password) {
		Account account=dao.findByAccountId(senderAccountId);
		account.setBalance(account.getBalance()+amount);
		dao.save(account);
		
		AccountDto accountDto=new AccountDto(account.getAccountId(),account.getInterestRate(),account.getBalance(),account.getDateOfOpening());
		return accountDto;
	}
	@Override
	public AccountDto withdraw(long accountId, String username, String password, double amount) {
		
		Account account = new Account();
		
		if(account.getBalance()>amount)
		account.setBalance(account.getBalance()-amount);
		dao.save(account);
		
		AccountDto accountDto=new AccountDto(account.getAccountId(),account.getInterestRate(),account.getBalance(),account.getDateOfOpening());
		return accountDto;
	}
	
	@Override
	public AccountDto deposite(long accountId, double amount) {
		
		Account account = dao.findByAccountId(accountId);
		account.setBalance(account.getBalance()+amount);
		dao.save(account);
		
		AccountDto accountDto=new AccountDto(account.getAccountId(),account.getInterestRate(),account.getBalance(),account.getDateOfOpening());
		return accountDto;
	}
}