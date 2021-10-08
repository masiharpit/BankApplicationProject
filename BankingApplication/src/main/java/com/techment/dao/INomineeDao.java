package com.techment.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.bank.dto.NomineeDto;
import com.techment.bank.entity.Nominee;

public interface INomineeDao extends JpaRepository<Nominee, Integer>{

	Nominee save(NomineeDto nomineeDto);

}
