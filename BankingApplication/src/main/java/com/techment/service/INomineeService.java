package com.techment.bank.service;

import java.util.List;

import com.techment.bank.dto.NomineeDto;
import com.techment.bank.entity.Nominee;

public interface INomineeService {

	/*
	public Nominee addNominee(Nominee nominee);
	public Nominee updateNominee(int nomineeId , Nominee nominee);
	public String deleteNominee(int nomineeId);
	public Nominee getNomineeById(int nomineeId);
	public List<Nominee> getAllNominees();

*/
	public NomineeDto addNominee(NomineeDto nominee);
	public String updateNominee(int nomineeId , NomineeDto nominee);
	public boolean deleteNominee(int nomineeId);
	public NomineeDto getNomineeById(int nomineeId);
	public List<NomineeDto> getAllNominees();


}
