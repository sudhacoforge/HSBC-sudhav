package com.customer.services;

import java.util.List;
import java.util.Optional;

import Customer.module.Customer;


public interface CustomerService {
public List<Customer> findAllCustomer();

public String insertCustomer(Customer customer);
public Optional<Customer> findById(int acno);
public Optional<Customer> findByName(String custname);
public String updateCustomer(Customer customer);
public String deleteCustomer(int acno);

}
