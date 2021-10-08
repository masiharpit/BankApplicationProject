package com.techment.service;

import java.util.List;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao Dao;
	
//    @Override
//	public Customer addCustomer(Customer customer) {
//		Customer customer1 = new Customer();
//		//CustomerDto customerDto;
//		if(customer.getCustomerId()!=0)
//		{
//			customer1.setCustomerId(customer.getCustomerId());
//		}
//		customer1.setCustomerName(customer.getCustomerName());
//		//customer.setAddress(customer.getAddress());
//		customer1.setAge(customer.getAge());
//		customer1.setEmailID(customer.getEmailID());
//		customer1.setPhoneNo(customer.getPhoneNo());
//		return Dao.save(customer1);
//	}
	
	
	public Customer addCustomer(CustomerDto customerdto) {
		CustomerDto.save(customerdto);
	   return null;
}

	

	@Override
	public Customer updateCustomer(long CustomerId,CustomerDto customerdto) {
		//Integer customerId = null;
		Customer existingcustomer = Dao.findByCustomerId(CustomerId);
		existingcustomer.setCustomerName(customerdto.getCustomerName());
		existingcustomer.setPhoneNo(customerdto.getPhoneNo());
		existingcustomer.setEmailID(customerdto.getEmailID());		
		//existingcustomer.setAccount(customerdto.getAccount());		
		existingcustomer.setAge(customerdto.getAge());
			
		Dao.save(existingcustomer);
		return existingcustomer;
		
}

	@Override
	public boolean deleteCustomer(long customer_id) {
		Dao.deleteById(customer_id);
		return true;
		
	}

	@Override
	public List<CustomerDto> listAllCustomer(double minBalance) {

		return null;
		//return Dao.findAll();
	}
   
	
	
    @Override
	public CustomerDto viewCustomerDetails(long customer_id) {
	
	Customer customer =  Dao.findById(customer_id).get();
	CustomerDto customerDto= new CustomerDto(customer.getCustomerId(),customer.getCustomerName(),customer.getPhoneNo(),customer.getEmailID(),customer.getAge());

	//return customer;
		
		return (CustomerDto) Dao.findAll();		
	}

	@Override
	public CustomerDto findCustomerById(long customer_id) {
		
		Customer customer =  Dao.findById(customer_id).get();
		CustomerDto customerDto= new CustomerDto(customer.getCustomerId(),customer.getCustomerName(),customer.getPhoneNo(),customer.getEmailID(),customer.getAge());

		//return customer;
			
			return (CustomerDto) Dao.findAll();		

	}
}	
	
//	@Override
//	public List<Customer> getAllCustomers() {
//				return Dao.findAll();
//		
//   
//}