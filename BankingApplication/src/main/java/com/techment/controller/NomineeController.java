package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.NomineeDto;
import com.techment.entity.Nominee;
import com.techment.exception.ResourceNotFoundException;
import com.techment.service.INomineeService;

@RestController
@RequestMapping("/nominee")
public class NomineeController {	
	
	
	@Autowired
	private INomineeService iNomineeService ;
	
	@GetMapping("/getAllNominees")
	public List<NomineeDto> getAllNominees()
	{
		return iNomineeService.getAllNominees();
	}
	
	@GetMapping("/getNomineeById/{nomineeId}")
	public ResponseEntity<NomineeDto> getNomineeById(@PathVariable(value = "nomineeId") int nomineeId)
			throws ResourceNotFoundException {

		try {
			NomineeDto nominee = iNomineeService.getNomineeById(nomineeId);
			return ResponseEntity.ok().body(nominee);
		} catch (Exception e) {
			throw new ResourceNotFoundException("Nominee not found for this id :: " + nomineeId);
		}

	}

	@PostMapping("/addNominee")
	public NomineeDto addNominee(@RequestBody NomineeDto nomineeDto)
	{
		return iNomineeService.addNominee(nomineeDto);
		
	}

	@PutMapping("/updateNominee/{nomineeId}")
	public ResponseEntity<NomineeDto> updateNominee(@PathVariable(value = "nomineeId") int nomineeId,
			@RequestBody NomineeDto nomineeDto) throws ResourceNotFoundException{
		try {
			 return new ResponseEntity<NomineeDto>(iNomineeService.updateNominee(nomineeId, nomineeDto), HttpStatus.OK);

		} catch (NoSuchElementException e) {
			throw new ResourceNotFoundException("Nominee not found for this id :: " + nomineeId);
		}

	}

	
	@DeleteMapping("/deleteNominee/{nomineeId}")
	public boolean deleteNominee(@PathVariable(value="nomineeId") int nomineeId) throws ResourceNotFoundException
	{
		try {
			return iNomineeService.deleteNominee(nomineeId);
		}
		catch (NoSuchElementException e) {
			throw new ResourceNotFoundException("Given Id is not in the db for deleting...");
			// TODO: handle exception
		}
	}

}
