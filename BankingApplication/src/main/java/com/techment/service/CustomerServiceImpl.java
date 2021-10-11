package com.techment.service;

import java.util.ArrayList;
import java.util.List;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.BeneficiaryDto;
import com.techment.dto.CustomerDto;
import com.techment.entity.Beneficiary;
import com.techment.entity.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao Dao;
	
    @Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		Customer customer1 = new Customer();
	
		customer1.setCustomerName(customerDto.getCustomerName());
		//customer.setAddress(customer.getAddress());
		customer1.setAge(customerDto.getAge());
		customer1.setEmailID(customerDto.getEmailID());
		customer1.setPhoneNo(customerDto.getPhoneNo());
		 Dao.save(customer1);
		 return customerDto;
	}
	
	

	

	@Override
	public CustomerDto updateCustomer(long CustomerId,CustomerDto customerDto) {
		
		Customer customer = Dao.findById(customerDto.getCustomerId()).get();
		customer.setCustomerName(customerDto.getCustomerName());
	    customer.setPhoneNo(customerDto.getPhoneNo());
		customer.setEmailID(customerDto.getEmailID());		
		//customer.setAccount(customerDto.getAccount());		
		customer.setAge(customerDto.getAge());
			
		
		return customerDto;
		
}

	@Override
	public boolean deleteCustomer(long customer_id) {
		Dao.deleteById(customer_id);
		return true;
		
	}

//	@Override
//	public List<CustomerDto> listAllCustomer(double minBalance) {
//
//		return null;
//		
//	}
   
	
	
//    @Override
//	public CustomerDto viewCustomerDetails(long accountId) {
//    	 Customer customer =	Dao.findById(accountId);
//    	 List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
//    	 for(Customer customerList : customer) {
//    		 new CustomerDto(customerList.getCustomerId(),
//    				 customerList.getCustomerName(),
//    				 customerList.getPhoneNo(),
//    				 customerList.getEmailID(),
//    				 customerList.getAge());
//	 
//    	 }
//		
//		return null;		
//	}

	@Override
	public CustomerDto findCustomerById(long customer_id) {
		
		Customer customer =  Dao.findById(customer_id).get();
		CustomerDto customerDto= new CustomerDto(customer.getCustomerId(),customer.getCustomerName(),customer.getPhoneNo(),customer.getEmailID(),customer.getAge());

		
			
			return customerDto;		

	}
}	
	
//	@Override
//	public List<Customer> getAllCustomers() {
//				return Dao.findAll();
//		
//   
//}