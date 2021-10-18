package com.techment.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.AccountDto;
import com.techment.dto.CustomerDto;
import com.techment.dto.TransactionDto;
import com.techment.entity.Account;
import com.techment.entity.Customer;
import com.techment.service.IAccountService;


@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class AccountController {
	
	@Autowired
	IAccountService service;
	
	
	@PostMapping("/transferMoney")
	public ResponseEntity<TransactionDto> transferMoney(@RequestParam long senderId, @RequestParam long receiverId, @RequestParam double amount
			,@RequestParam String username,@RequestParam String password) {
		return new ResponseEntity<TransactionDto>(service.transferMoney(senderId, receiverId, amount, username, password), HttpStatus.CREATED);
	}
	
	@PostMapping("/withDrawMoney")
	public ResponseEntity<TransactionDto> withdrawMoney(@RequestParam long accountId, @RequestParam String username, @RequestParam String password
			,@RequestParam double amount) {
		return new ResponseEntity<TransactionDto>(service.withdraw(accountId, username, password, amount),HttpStatus.CREATED);
	}	
	
	@PostMapping("/DepositMoney")
	public ResponseEntity<TransactionDto> depositMoney(@RequestParam long accountId,@RequestParam double amount) {
		return new ResponseEntity<TransactionDto>(service.deposit(accountId, amount),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAccountById/{accountId}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable long accountId) {
		return new ResponseEntity<AccountDto>(service.findAccountById(accountId), HttpStatus.CREATED);
	}	
	
	@PostMapping("/AddAccount/{customerId}")
	public ResponseEntity<AccountDto> AddAccount(@RequestBody AccountDto accountDto, @PathVariable long customerId) {
		return new ResponseEntity<AccountDto>(service.addAccount(accountDto,customerId),HttpStatus.CREATED);
	}	
}