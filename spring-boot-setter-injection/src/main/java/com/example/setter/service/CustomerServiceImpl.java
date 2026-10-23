package com.example.setter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.setter.entity.Customer;
import com.example.setter.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerRepo.save(c);
	} 

}
