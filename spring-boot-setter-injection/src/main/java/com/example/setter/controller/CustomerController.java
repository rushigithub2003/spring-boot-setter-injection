package com.example.setter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.setter.entity.Customer;
import com.example.setter.service.CustomerService;

@RestController
public class CustomerController {

	private CustomerService customerService;
	
	@Autowired
	public void setCustomerService(CustomerService customerService)
	{
		this.customerService=customerService;
	}
	
	@PostMapping("customer")
	String addCustomer(@RequestBody Customer c)
	{
		customerService.addCustomer(c);
		return "Customer Added";
	}
	
}
