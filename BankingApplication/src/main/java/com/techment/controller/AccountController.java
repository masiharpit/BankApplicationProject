package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.AccountDto;
import com.techment.entity.Account;
import com.techment.service.AccountServiceImpl;
import com.techment.service.IAccountService;


@RestController
@RequestMapping("/transaction")
public class AccountController {
	
	@Autowired
	IAccountService service;
	
	@PostMapping("/get/{id}")
	public AccountDto transferMoney(@PathVariable long id) {
		return service.transferMoney(id, 111, 100, "dxhx", "hfcsd");
	}
}