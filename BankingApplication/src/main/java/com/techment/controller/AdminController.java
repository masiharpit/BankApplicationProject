package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.AdminDto;
import com.techment.dto.BeneficiaryDto;
import com.techment.entity.Admin;
import com.techment.entity.Beneficiary;
import com.techment.exception.IdNotFoundException;
import com.techment.service.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/adminController")
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@PutMapping("/update-admin/{id}")
	public ResponseEntity<AdminDto> updateAdmin(@PathVariable("id") int id, @RequestBody AdminDto adminDto)
			throws IdNotFoundException {
		try {
			return new ResponseEntity<AdminDto>(adminService.updateAdmin(adminDto,id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Id is not found for updating details!!!");

		}
	}
	
	
	
	//rest-controller api to fetch admin list
	@GetMapping("/list-all-admins")
	public List<AdminDto> adminList() {
		return adminService.listAllAdmins();
	}
	
	//rest controller to fetch admin by id
	@GetMapping("/find-admin-by-Id/{id}")
	public ResponseEntity<AdminDto> findAdmin(@PathVariable("id") long id) throws IdNotFoundException {
		try {
			AdminDto adminDto = adminService.findAdminById(id);
			return new ResponseEntity<AdminDto>(adminDto, HttpStatus.OK);

		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for fetching details...");
		}

	}
	
	
	// build create admin RESTAPI to add admin...
	@PostMapping("/add-admin")
	public ResponseEntity<AdminDto> addAdmin(@RequestBody AdminDto adminDto){
		
         return new ResponseEntity<AdminDto>(adminService.addAdmin(adminDto), HttpStatus.CREATED)  ;
	}
	
	
	@DeleteMapping("/delete-admin/{id}")
	public boolean removeAdmin(@PathVariable("id") long id) throws IdNotFoundException {
		try {
			return adminService.removeAdmin(id);
		} catch (NoSuchElementException e) {
			throw new IdNotFoundException("Given Id is not in the db for deleting...");
		}

	}
	
	

}
