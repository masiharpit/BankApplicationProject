package com.techment.service;
import java.util.List;
import java.util.Set;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
public interface ICustomerService {

	
	Customer addCustomer(CustomerDto customer);
	Customer  updateCustomer(long CustomerId,CustomerDto customer); 
    boolean  deleteCustomer(long customer_id); 
	List<CustomerDto> listAllCustomer(double minBalance);
	CustomerDto viewCustomerDetails(long customer_id);
	CustomerDto findCustomerById(long customer_id);
	
}