package com.techment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.services.ITransactionService;

@CrossOrigin
@RestController
@RequestMapping(value="/transaction")
public class TransactionController {

	@Autowired
	private ITransactionService service;
	
	
}
