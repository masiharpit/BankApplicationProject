package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.BeneficiaryDao;
import com.techment.dto.BeneficiaryDto;
import com.techment.entity.Beneficiary;
import com.techment.exception.IdNotFoundException;

/*
 * Beneficiary Service
 * date : 05/01/2021
 */


@Service
public class BeneficiaryServiceImpl implements IBeneficiaryService{

	 @Autowired
	private BeneficiaryDao beneficiaryDao;
	
     @Autowired
	public BeneficiaryServiceImpl(BeneficiaryDao beneficiaryDao) {
		super();
		this.beneficiaryDao = beneficiaryDao;
	}

     
     //service to add new beneficiary
     @Override
 	public String addNewBeneficiary(BeneficiaryDto beneficiaryDto) {
 		Beneficiary beneficiary = new Beneficiary();
 		beneficiary.setBeneficiaryName(beneficiaryDto.getBeneficiaryName());
    	 beneficiary.setBeneficiaryAccNumber(beneficiaryDto.getBeneficiaryAccNumber());
    	 beneficiary.setBeneficiaryIfsc(beneficiaryDto.getBeneficiaryIfsc());
    	 beneficiaryDao.save(beneficiary);
 		return "Beneficiary Added";
 	}
     
     
     
//     @Override
// 	public Beneficiary updateBenefiaciary(Beneficiary beneficiary, int id) throws IdNotFoundException {
//
// 		// check whether a employee exist in a DB or not
//    	 Beneficiary existingBeneficiary = beneficiaryDao.findById(id).orElseThrow(
//    		  ()-> new IdNotFoundException("Id "+id +" not found for updating  the details.."));
//
//      existingBeneficiary.setBeneficiaryName(beneficiary.getBeneficiaryName());
//      existingBeneficiary.setBeneficiaryAccNumber(beneficiary.getBeneficiaryAccNumber());
//      existingBeneficiary.setBeneficiaryIfsc(beneficiary.getBeneficiaryIfsc());
//      
//      beneficiaryDao.save(existingBeneficiary);
//      return existingBeneficiary;
// 	}
	


    
    //////////--------------dto----------------///
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
    

   
/////--------with class
//	@Override
//	public List<Beneficiary> listAllBeneficiaries() {
//		return beneficiaryDao.findAll();
//	}


//	@Override
//	public Beneficiary findBeneficiaryById1(int id) throws IdNotFoundException {
//
//		return beneficiaryDao.findById(id).orElseThrow(() -> 
//	           	new IdNotFoundException("Id not found to fetch the details.."));
//	
//	} 

    //---------------- service for updating beneficiary details..------------------------
//    @Override
//  	public BeneficiaryDto updateBenefiaciary(BeneficiaryDto beneficiaryDto, int id){
//
//    	Beneficiary beneficiary = beneficiaryDao.findById(id).get();
//    	BeneficiaryDto existingBeneficiary=beneficiaryDao.findById(id).get();
//  		// check whether a employee exist in a DB or not
//     	 BeneficiaryDto existingBeneficiary = beneficiaryDao.findById(id).orElseThrow(
//     		  ()-> new IdNotFoundException("Id "+id +" not found for updating  the details.."));
//
//       existingBeneficiary.setBeneficiaryName(beneficiary.getBeneficiaryName());
//       existingBeneficiary.setBeneficiaryAccNumber(beneficiary.getBeneficiaryAccNumber());
//       existingBeneficiary.setBeneficiaryIfsc(beneficiary.getBeneficiaryIfsc());
//       
//       beneficiaryDao.save(existingBeneficiary);
//       return existingBeneficiary;
//  	}
//    
//	
	
	
	
	
}
