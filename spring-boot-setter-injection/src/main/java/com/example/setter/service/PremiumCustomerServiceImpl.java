package com.example.setter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.setter.entity.Customer;
import com.example.setter.repository.CustomerRepo;

public class PremiumCustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerRepo.save(c);
		
	}

}
