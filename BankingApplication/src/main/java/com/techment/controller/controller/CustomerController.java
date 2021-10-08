package com.techment.controller;

import java.util.List;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
		
           @Autowired	
           private ICustomerService service;
           
           @GetMapping(value = "/viewCustomerDetails")
          public Customer viewCustomerDetails(long customer_id)
          {
        	CustomerDto customer = service.findCustomerById(customer_id);
        	Customer customer2 = new Customer(customer.getCustomerId(), customer.getCustomerName(), customer.getPhoneNo(), customer.getEmailID(), customer.getAge());
        	return customer2;
           }
	       
	       public CustomerDto findCustomerById(long customer_id)
           {
	    	   return service.findCustomerById(customer_id);
	       }
	       
	       @PostMapping("/addCustomer")
	       public Customer addCustomer(@RequestBody CustomerDto customer)
	       {
	    	   return service.addCustomer(customer);
	       }
      
	       @PutMapping("/updateCustomer/{id}")
           public Customer updateCustomer(@RequestBody CustomerDto customer)
           {
	    	   return service.addCustomer(customer);
	       }
	       
	       @DeleteMapping("/deleteCustomer/{customer_id}")
           public boolean deleteCustomerById(@PathVariable long customer_id)
	       {
	    	   return service.deleteCustomer(customer_id);
	       }
	       
           public List<CustomerDto> listAllCustomer(double minBalance)
   	       {
	   		    return service.listAllCustomer(minBalance);	   	   
		
           }
}