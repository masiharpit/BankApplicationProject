package com.techment.service;

import java.util.List;

import com.techment.dto.AccountDto;
import com.techment.entity.Account;

public interface IAccountService {
	AccountDto transferMoney(long senderAccountId, long receiverAccountId, double amount , String username , String password );
	AccountDto withdraw(long AccountId, String username, String password, double amount );
	AccountDto deposite(long accountId, double amount) ;
	
 

}