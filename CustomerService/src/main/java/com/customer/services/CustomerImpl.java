package com.customer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.repo.CustomerRepository;

import Customer.module.Customer;

@Service
public class CustomerImpl implements CustomerService {
	 
	
	@Autowired
	CustomerRepository repo;
	

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Inserted successfully";
	}

	@Override
	public Optional<Customer> findById(int acno) {
		// TODO Auto-generated method stub
		
		return repo.findById(acno);
		
	}

	@Override
	public Optional<Customer> findByName(String custname) {
		// TODO Auto-generated method stub
		return repo.findByName(custname);
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "customer updated successfully";
	}

	@Override
	public String deleteCustomer(int acno) {
		// TODO Auto-generated method stub
		repo.deleteById(acno);
		return "customer deleted";
	}


}
