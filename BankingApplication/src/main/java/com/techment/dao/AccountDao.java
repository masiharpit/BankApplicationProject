package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.dto.AccountDto;
import com.techment.entity.Account;

public interface AccountDao extends JpaRepository<Account, Integer> {

	Account findByAccountId(long accountId);
}
