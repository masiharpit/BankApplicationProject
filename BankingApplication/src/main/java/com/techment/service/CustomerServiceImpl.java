package com.techment.service;

import java.util.ArrayList;
import java.util.List;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.AccountDao;
import com.techment.dao.ICustomerDao;
import com.techment.dto.BeneficiaryDto;
import com.techment.dto.CustomerDto;
import com.techment.entity.Account;
import com.techment.entity.Beneficiary;
import com.techment.entity.Customer;
import com.techment.enum_class.Gender;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao Dao;
	@Autowired
	private AccountDao accountDao;
	
    @Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		Customer customer1 = new Customer();
	
		customer1.setCustomerName(customerDto.getCustomerName());
		customer1.setAge(customerDto.getAge());
		customer1.setEmailID(customerDto.getEmailID());
		customer1.setPhoneNo(customerDto.getPhoneNo());
		customer1.setGender(customerDto.getGender());
		customer1.setAccount(customerDto.getAccount());
		
		
//		Account account=accountDao.findByAccountId(accountId);
//	    customer1.setAccount(account);
	    
		 Dao.save(customer1);
		 return customerDto;
		 
		 
		 
	}
	
	

	

	@Override
	public CustomerDto updateCustomer(long CustomerId,CustomerDto customerDto) {
		
		Customer customer = Dao.findById(CustomerId).get();
		customer.setCustomerName(customerDto.getCustomerName());
	    customer.setPhoneNo(customerDto.getPhoneNo());
		customer.setEmailID(customerDto.getEmailID());		
		//customer.setAccount(customerDto.getAccount());		
		customer.setAge(customerDto.getAge());
		customer.setGender(customerDto.getGender());
		Dao.save(customer);	
		
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
   
	
	
    @Override
	public List<CustomerDto> viewCustomerDetails() {
    	 List<Customer> customer = Dao.findAll();
    	 List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
    	 for(Customer customerList : customer) {
    		 customerDto.add(new CustomerDto(customerList.getCustomerId(),
    				 customerList.getCustomerName(),
    				 customerList.getPhoneNo(),
    				 customerList.getEmailID(),
    				 customerList.getAge(),
    				 customerList.getGender(),
    				 customerList.getAccount()
    				 ));
	 
    	 }
    	 

		
		return customerDto;		
	}

    
    
	@Override
	public CustomerDto findCustomerById(long customer_id) {
		
		Customer customer =  Dao.findById(customer_id).get();
		CustomerDto customerDto= new CustomerDto(customer.getCustomerId(),customer.getCustomerName(),customer.getPhoneNo(),customer.getEmailID(),customer.getAge(),customer.getGender(),customer.getAccount());

		
			
			return customerDto;		

	}
}	
	
