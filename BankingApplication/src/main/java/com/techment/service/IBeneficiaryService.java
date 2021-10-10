package com.techment.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.techment.dto.BeneficiaryDto;
import com.techment.entity.Beneficiary;
import com.techment.exception.IdNotFoundException;

@Service
public interface IBeneficiaryService {

    String addNewBeneficiary(BeneficiaryDto beneficiary) ;

//	 Beneficiary updateBenefiaciary(Beneficiary beneficiary,int id) throws IdNotFoundException;

	// boolean deleteBeneficiary(int id) throws IdNotFoundException;
	
//	 Beneficiary findBeneficiaryById1(int id) throws IdNotFoundException;

//    List<Beneficiary> listAllBeneficiaries();
    
	 
//	 BeneficiaryDto updateBenefiaciary(BeneficiaryDto beneficiary,int id);
    
//    BeneficiaryDto addNewBeneficiary(Beneficiary beneficiaryDto) ;
	 BeneficiaryDto findBeneficiaryById(int id) ;
    List<BeneficiaryDto> listAllBeneficiaries();
    boolean deleteBeneficiary(int id) ;
    
    
}
