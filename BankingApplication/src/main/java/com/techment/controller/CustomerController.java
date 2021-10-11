package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

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

import com.techment.dto.BeneficiaryDto;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IdNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping("/customerController")
public class CustomerController {
		
           @Autowired	
           private ICustomerService service;
           
//           @GetMapping("/viewCustomerDetails")
//          public  List<CustomerDto> viewCustomerDetails()
//          {
//        	return service.viewCustomerDetails();
//           }
	       
           
           @GetMapping("/viewCustomerById/{id}")
	       public ResponseEntity<CustomerDto> findCustomerById(@PathVariable("id") long customer_id) throws IdNotFoundException
           {
	    	  try {
	   			CustomerDto cutomerDto = service.findCustomerById(customer_id);
	   			return new ResponseEntity<CustomerDto>(cutomerDto, HttpStatus.OK);

	   		} catch (NoSuchElementException e) {
	   			throw new IdNotFoundException("Given Id is not in the db for fetching details...");
	   		}
	       }
           
	       
	       @PostMapping("/addCustomer")
	       public CustomerDto addCustomer(@RequestBody CustomerDto customer)
	       {
	    	   return service.addCustomer(customer);
	       }
      
       @PutMapping("/updateCustomer/{id}")
          public ResponseEntity<CustomerDto> update(@PathVariable("id") long id, @RequestBody CustomerDto customer)
			   throws IdNotFoundException {
		     try {
		    	 
		    	  CustomerDto customerDto = service.findCustomerById(id);
	              customerDto.setCustomerName(customer.getCustomerName());
	              customerDto.setPhoneNo(customer.getPhoneNo());
	              customerDto.setEmailID(customer.getEmailID());		
	              //customerDto.setAccount(customer.getAccount());		
	              customerDto.setAge(customer.getAge());
	    	      service.addCustomer(customerDto);
	              return new ResponseEntity<CustomerDto>(customerDto, HttpStatus.OK);
                    } 
		           catch (NoSuchElementException e) {
	                      throw new IdNotFoundException("Id is not found for updating details!!!");

                  }
} 
	              
  
	       
	       @DeleteMapping("/deleteCustomer/{customer_id}")
           public boolean deleteCustomerById(@PathVariable long customer_id)
	       {
	    	   return service.deleteCustomer(customer_id);
	       }
	       
//           public List<CustomerDto> listAllCustomer(double minBalance)
//   	       {
//	   		    return service.listAllCustomer(minBalance);	   	   
//		
//           }
}