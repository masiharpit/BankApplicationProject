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
import com.techment.dao.BeneficiaryDao;
import com.techment.dto.BeneficiaryDto;
import com.techment.entity.Beneficiary;
import com.techment.exception.IdNotFoundException;
import com.techment.exception.ResourceNotFoundException;
import com.techment.service.BeneficiaryServiceImpl;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryController {

	@Autowired
	private BeneficiaryServiceImpl service;

	@Autowired
	public BeneficiaryController(BeneficiaryServiceImpl service) {
		super();
		this.service = service;
	}

	@GetMapping("/list-all-beneficiaries")
	public List<BeneficiaryDto> listAllBeneficiaries() {
		return service.listAllBeneficiaries();
	}

	@GetMapping("/find-beneficiary/{id}")
	public ResponseEntity<BeneficiaryDto> findBeneficiaryById(@PathVariable("id") int id) throws IdNotFoundException {
		try {
			BeneficiaryDto beneficiaryDto = service.findBeneficiaryById(id);
			return new ResponseEntity<BeneficiaryDto>(beneficiaryDto, HttpStatus.OK);

		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for fetching details...");
		}

	}

	@DeleteMapping("/delete-beneficiary/{id}")
	public boolean deleteBeneficiary(@PathVariable("id") int id) throws IdNotFoundException {
		try {
			return service.deleteBeneficiary(id);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for deleting...");
		}

	}

	//////////////////////

	@PutMapping("/update-beneficiary/{id}")
	public ResponseEntity<String> updateBenefiaciary(@PathVariable("id") int id, @RequestBody Beneficiary beneficiary)
			throws IdNotFoundException {
		try {
			BeneficiaryDto beneficiaryDto = service.findBeneficiaryById(id);
			beneficiaryDto.setBeneficiaryName(beneficiary.getBeneficiaryName());
			beneficiaryDto.setBeneficiaryAccNumber(beneficiary.getBeneficiaryAccNumber());
			beneficiaryDto.setBeneficiaryIfsc(beneficiary.getBeneficiaryIfsc());
			service.addNewBeneficiary(beneficiaryDto);
			return new ResponseEntity<String>("Updated successfully", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Id is not found for updating details!!!");

		}
	}

	// build create beneficiary RESTAPI
	@PostMapping("/add-beneficiary")
	public ResponseEntity<String> addBenefiaciary(@Validated @RequestBody BeneficiaryDto beneficiaryDto,
			BindingResult bindingResult) throws MethodArgumentNotValidException {
		if (bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();

			for (FieldError f : errors) {
				errorList.add(f.getDefaultMessage());
			}

			// throw new ValidationException(errorList);
			throw new com.techment.exception.ValidationException(errorList);
		}

		service.addNewBeneficiary(beneficiaryDto);
		return new ResponseEntity<String>("added new beneficiary", HttpStatus.OK);
	}

	
	
	
	// build create beneficiary RESTAPI
//		@PostMapping("/add-beneficiary")
//		public ResponseEntity<Beneficiary> addBenefiaciary(@RequestBody @Validated Beneficiary beneficiary) {
//			
//			return new ResponseEntity<Beneficiary>(service.addNewBeneficiary(beneficiary), HttpStatus.CREATED);
//		}

}
