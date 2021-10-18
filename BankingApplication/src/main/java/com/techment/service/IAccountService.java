package com.techment.service;


import com.techment.dto.AccountDto;
import com.techment.dto.CustomerDto;
import com.techment.dto.TransactionDto;
import com.techment.entity.Account;

public interface IAccountService {
	
	TransactionDto transferMoney(long senderAccountId, long receiverAccountId, double amount , String username , String password );
	TransactionDto withdraw(long AccountId, String username, String password, double amount );
	TransactionDto deposit(long accountId, double amount) ;
	AccountDto findAccountById(long accountId);
	AccountDto addAccount(AccountDto accountDto, long CustomerId);
	AccountDto updateAccount(AccountDto accountDto);
	AccountDto deleteAccount(long accountId);
}