package com.techment.service;
import java.util.List;
import java.util.Set;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
public interface ICustomerService {

	
	CustomerDto addCustomer(CustomerDto customer);
	CustomerDto  updateCustomer(long CustomerId,CustomerDto customer); 
    boolean  deleteCustomer(long customer_id); 
	//List<CustomerDto> listAllCustomer(double minBalance);
	List<CustomerDto> viewCustomerDetails();
	CustomerDto findCustomerById(long customer_id);
	
}