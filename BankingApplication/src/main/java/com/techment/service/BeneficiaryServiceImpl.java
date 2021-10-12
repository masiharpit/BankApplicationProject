package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.BeneficiaryDao;
import com.techment.dto.BeneficiaryDto;
import com.techment.entity.Beneficiary;
import com.techment.exception.IdNotFoundException;




@Service
public class BeneficiaryServiceImpl implements IBeneficiaryService{
	/*
	 * Beneficiary Service
	 *  all service implementation of the beneficiary.
	 */
	
	
	 @Autowired
	private BeneficiaryDao beneficiaryDao;
	
     @Autowired
	public BeneficiaryServiceImpl(BeneficiaryDao beneficiaryDao) {
		super();
		this.beneficiaryDao = beneficiaryDao;
	}

     
     //service to add new beneficiary
     @Override
 	public BeneficiaryDto addNewBeneficiary(BeneficiaryDto beneficiaryDto) {
 		Beneficiary beneficiary = new Beneficiary();
 		beneficiary.setBeneficiaryName(beneficiaryDto.getBeneficiaryName());
    	 beneficiary.setBeneficiaryAccNumber(beneficiaryDto.getBeneficiaryAccNumber());
    	 beneficiary.setBeneficiaryIfsc(beneficiaryDto.getBeneficiaryIfsc());
    	 beneficiaryDao.save(beneficiary);
 		return beneficiaryDto;
 	}

    @Override
	public List<BeneficiaryDto> listAllBeneficiaries() {
       List<Beneficiary> beneficiaryList =	beneficiaryDao.findAll();
		
		List<BeneficiaryDto> beneficiaryDto = new ArrayList<BeneficiaryDto>();
		
		for(Beneficiary beneficiary : beneficiaryList)
		{

			beneficiaryDto.add(new BeneficiaryDto(beneficiary.getBeneficiaryId(),
					beneficiary.getBeneficiaryName(),
					beneficiary.getBeneficiaryAccNumber(),
					beneficiary.getBeneficiaryIfsc()
					));
		}
		return beneficiaryDto;
	}
	
	@Override
	public BeneficiaryDto findBeneficiaryById(int id) {

		Beneficiary beneficiary =  beneficiaryDao.findById(id).get();
		BeneficiaryDto beneficiaryDto= new BeneficiaryDto(beneficiary.getBeneficiaryId(),
				beneficiary.getBeneficiaryName(),
				beneficiary.getBeneficiaryAccNumber(),
				beneficiary.getBeneficiaryIfsc());
		
		return beneficiaryDto;
		}


	//service to delete the beneficiary
    @Override
	public boolean deleteBeneficiary(int id) {
    	//check wheather the id is null or not...
		if( beneficiaryDao.findById(id).get() != null) {
			beneficiaryDao.deleteById(id);
	    return true;
		} else
			return false;
	}


    //service implement to update beneficiary detail...
	@Override
	public BeneficiaryDto updateBenefiaciary(BeneficiaryDto beneficiaryDto,int bId) {
		Beneficiary beneficiary = beneficiaryDao.findById(bId).get();
		beneficiary.setBeneficiaryName(beneficiaryDto.getBeneficiaryName());
		beneficiary.setBeneficiaryAccNumber(beneficiaryDto.getBeneficiaryAccNumber());
		beneficiary.setBeneficiaryIfsc(beneficiaryDto.getBeneficiaryIfsc());
		beneficiaryDao.save(beneficiary);
		return beneficiaryDto;
	}

	
}
