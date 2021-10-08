package com.techment.bank.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.bank.dao.INomineeDao;
import com.techment.bank.dto.NomineeDto;
import com.techment.bank.entity.Nominee;

@Service
public class NomineeServiceImpl implements INomineeService{

	@Autowired
	private INomineeDao repository ;

	@Override
	public NomineeDto addNominee(NomineeDto nominee) {
		  repository.save(nominee);
		  return nominee ;
	}

	@Override
	public String updateNominee(int nomineeId, NomineeDto nominee) 
	{
		Nominee existingNominee = repository.findById(nomineeId).get();
		existingNominee.setNomineeId(nominee.getNomineeId());
		existingNominee.setName(nominee.getName());
		existingNominee.setGovtId(nominee.getGovtId());
		existingNominee.setPhoneNo(nominee.getPhoneNo());
		repository.save(existingNominee);
		return "updated" ;
	}

	@Override
	public boolean deleteNominee(int nomineeId) {

		if(repository.findById(nomineeId).get() != null)
		{
			repository.deleteById(nomineeId);
			return true ;
		}
		else 
			return false ;
	}

	@Override
	public NomineeDto getNomineeById(int nomineeId) {
		
		Nominee nominee = repository.findById(nomineeId).get();
		NomineeDto nomineeDto = new NomineeDto(nominee.getNomineeId(), nominee.getName(),nominee.getGovtId(), nominee.getPhoneNo());
		return nomineeDto;
	
	}

	@Override
	public List<NomineeDto> getAllNominees() {
		
		List<Nominee> nomineeList = repository.findAll();
		List<NomineeDto> nomineeDto = new ArrayList<NomineeDto>();
		
		for(Nominee nominee : nomineeList)
		{
			nomineeDto.add(new NomineeDto(nominee.getNomineeId(),nominee.getName(), nominee.getGovtId() , nominee.getPhoneNo()));
		}
		return nomineeDto;
	}

	
	
	/*
	 * with entity class
	@Override
	public Nominee addNominee(Nominee nominee) {
		  repository.save(nominee);
		  return nominee ;
	}
	
	@Override
	public List<Nominee> getAllNominees()
	{
		return repository.findAll();
		
	}

	@Override
	public Nominee updateNominee(int nomineeId , Nominee nominee) 
	{
		Nominee existingNominee = repository.findById(nomineeId).get();
		existingNominee.setNomineeId(nominee.getNomineeId());
		existingNominee.setName(nominee.getName());
		existingNominee.setGovtId(nominee.getGovtId());
		existingNominee.setPhoneNo(nominee.getPhoneNo());
		repository.save(existingNominee);
		return existingNominee;
	}

	@Override
	public String deleteNominee(int nomineeId) {
		repository.deleteById(nomineeId);
		return "Nominee Deleted || " + nomineeId ;
	}

	@Override
	public Nominee getNomineeById(int nomineeId) {
		return repository.findById(nomineeId).get();

	}		
	
	*/
}
