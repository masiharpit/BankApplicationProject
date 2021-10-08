package com.techment.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Beneficiary;

@Repository
public interface BeneficiaryDao  extends JpaRepository<Beneficiary, Integer>{


}
