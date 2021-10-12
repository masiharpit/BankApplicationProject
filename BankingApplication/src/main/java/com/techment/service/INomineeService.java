package com.techment.service;

import java.util.List;

import com.techment.dto.NomineeDto;
import com.techment.entity.Nominee;

public interface INomineeService {


	public NomineeDto addNominee(NomineeDto nomineeDto);
	public NomineeDto updateNominee(int nomineeId , NomineeDto nominee);
	public boolean deleteNominee(int nomineeId);
	public NomineeDto getNomineeById(int nomineeId);
	public List<NomineeDto> getAllNominees();


}
