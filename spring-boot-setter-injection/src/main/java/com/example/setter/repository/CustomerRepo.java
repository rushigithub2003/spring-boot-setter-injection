package com.example.setter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.setter.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
