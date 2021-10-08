package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Long>{

}
