package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.dto.NomineeDto;
import com.techment.entity.Nominee;

public interface INomineeDao extends JpaRepository<Nominee, Integer>{

	Nominee save(NomineeDto nomineeDto);

}
