package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.AdminDto;
import com.techment.dto.BeneficiaryDto;
import com.techment.dto.BranchDto;
import com.techment.exception.IdNotFoundException;
import com.techment.service.AdminService;
import com.techment.service.SuperAdminServiceImpl;

@RestController
@RequestMapping("/superAdminController")
public class SuperAdminController {
	
	@Autowired
	SuperAdminServiceImpl serviceImpl;
	
	@Autowired
	AdminService adminService;
	
	//  create add-branch RESTAPI
	@PostMapping("/add-branch")
	public ResponseEntity<BranchDto> addNewBranch( @RequestBody BranchDto branchDto){
	       return new ResponseEntity<BranchDto>(serviceImpl.addBranch(branchDto), HttpStatus.CREATED)  ;
	 }
	
	
	@DeleteMapping("/delete-branch/{id}")
	public boolean deleteBranch(@PathVariable("id") int id) throws IdNotFoundException {
		try {
			return serviceImpl.removeBranch(id);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for deleting...");
		}

	}
	
	
	@GetMapping("/list-all-branches")
	public List<BranchDto> listAllBranches() {
		return serviceImpl.listAllBranch();
	}

	@GetMapping("/find-branch/{id}")
	public ResponseEntity<BranchDto> findBranchById(@PathVariable("id") long id) throws IdNotFoundException {
		try {
			BranchDto branchDto = serviceImpl.fetchBranchById(id);
			return new ResponseEntity<BranchDto>(branchDto, HttpStatus.OK);

		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for fetching details...");
		}

	}


	@PutMapping("/update-branch/{id}")
	public ResponseEntity<BranchDto> updateBranch(@PathVariable("id") long id, @RequestBody BranchDto branchDto)
			throws IdNotFoundException {
		try {
           return new ResponseEntity<BranchDto>(serviceImpl.updateBranch(branchDto,id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Id is not found for updating details!!!");

		}
	}
	
	
	
	//rest-controller api to fetch admin list
	@GetMapping("/list-all-admins")
	public List<AdminDto> adminList() {
		return adminService.listAllAdmins();
	}
	

}
