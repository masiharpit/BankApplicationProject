package com.techment.service;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.AccountDao;
import com.techment.dao.ICustomerDao;
import com.techment.dao.ITransactionDao;
import com.techment.dto.AccountDto;
import com.techment.dto.CustomerDto;
import com.techment.dto.TransactionDto;
import com.techment.entity.Account;
import com.techment.entity.Customer;
import com.techment.entity.Transaction;

@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	AccountDao Accountdao;
	
	@Autowired
	ITransactionDao transactionDao;
	
	@Autowired
	ICustomerDao customerDao;
	
	@Override
	public TransactionDto transferMoney(long senderAccountId, long receiverAccountId, double amount, String username,
			String password) {
		
		Account senderaccount=Accountdao.findByAccountId(senderAccountId);
		Account receiveraccount=Accountdao.findByAccountId(receiverAccountId);
		TransactionDto transactionDto = new TransactionDto();
		LocalDate transactionDateAndTime = null;
		Transaction transaction =new Transaction();
		
		if(senderaccount.getBalance()>=amount) 
		{
		receiveraccount.setBalance(receiveraccount.getBalance()+amount);
		senderaccount.setBalance(senderaccount.getBalance()-amount);
		Accountdao.save(senderaccount);
		Accountdao.save(receiveraccount);
		
		transactionDto.setTransaction_id(UUID.randomUUID().toString());
		transactionDto.setAccount_id(senderaccount.getAccountId());
		transactionDto.setAmount(amount);
		transactionDto.setTransactionDateAndTime(transactionDateAndTime.now());
		transactionDto.setBankAccount(receiveraccount);
		transactionDto.setTransactionRemarks("Successfully Transfered");
		}
		
		else {
			transactionDto.setTransaction_id(null);
			transactionDto.setAccount_id(senderaccount.getAccountId());
			transactionDto.setAmount(amount);
			transactionDto.setTransactionDateAndTime(transactionDateAndTime.now());
			transactionDto.setBankAccount(receiveraccount);
			transactionDto.setTransactionRemarks("Failed transaction");
		}
		return transactionDto;
	}
	
	@Override
	public TransactionDto withdraw(long accountId, String username, String password, double amount) {
		
		Account account =Accountdao.findByAccountId(accountId);
		TransactionDto transactionDto = new TransactionDto();
		LocalDate transactionDateAndTime = null;
		
		if(account.getBalance()>amount) {
		account.setBalance(account.getBalance()-amount);
		Accountdao.save(account);
		
		transactionDto.setTransaction_id(UUID.randomUUID().toString());
		transactionDto.setAccount_id(account.getAccountId());
		transactionDto.setAmount(amount);
		transactionDto.setTransactionDateAndTime(transactionDateAndTime.now());
		transactionDto.setBankAccount(account);
		transactionDto.setTransactionRemarks("Successfully Transfered");
		}
		
		else {
			transactionDto.setTransaction_id(null);
			transactionDto.setAccount_id(account.getAccountId());
			transactionDto.setAmount(amount);
			transactionDto.setTransactionDateAndTime(transactionDateAndTime.now());
			transactionDto.setBankAccount(account);
			transactionDto.setTransactionRemarks("Failed transaction");
		}
		return transactionDto;
	}
	
	@Override
	public TransactionDto deposit(long accountId, double amount) {
		
		Account account = Accountdao.findByAccountId(accountId);
		TransactionDto transactionDto = new TransactionDto();
		LocalDate transactionDateAndTime = null;
		
		account.setBalance(account.getBalance()+amount);
		Accountdao.save(account);
		
		transactionDto.setTransaction_id(UUID.randomUUID().toString());
		transactionDto.setAccount_id(account.getAccountId());
		transactionDto.setAmount(amount);
		transactionDto.setTransactionDateAndTime(transactionDateAndTime.now());
		transactionDto.setBankAccount(account);
		transactionDto.setTransactionRemarks("Successfully Transfered");
		return transactionDto;
	}
	
	@Override
	public AccountDto findAccountById(long accountId) {
		Account account = Accountdao.findByAccountId(accountId);
		AccountDto accountDto=new AccountDto(account.getAccountId(),account.getBalance());
		return accountDto;
	}
	
	@Override
	public AccountDto addAccount(AccountDto accountDto, long customerId) {
		Account account =new Account();
		LocalDate AccountOpeningDate = null;
		
		account.setAccountId(accountDto.getAccountId());
		account.setBalance(accountDto.getBalance());
		account.setDateOfOpening(AccountOpeningDate.now());
		account.setInterestRate(12);
		account.setAccountType(accountDto.getAccountType());
		
		Customer customer =customerDao.findByCustomerId(customerId);
		
		account.setCustomer(customer);
		Accountdao.save(account);
		return accountDto;
	}
	
	@Override
	public AccountDto updateAccount(AccountDto accountDto) {
		return null;
	}
	
	@Override
	public AccountDto deleteAccount(long accountId) {
		return null;
	}
}