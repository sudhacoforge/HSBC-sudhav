package com.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.manager.model.CustomerAccountDetails;
import com.manager.model.TranscationDetails;
import com.manager.repository.ManagerRepository;

public class ManagerServiceImpl implements ManagerService{
	@Autowired
	ManagerRepository repo;
	@Autowired
	RestTemplate template; 
	public List<CustomerAccountDetails> findAllCustomerAccounts() {
	
	return findAllCustomerAccounts();
	} 
	public String insertNotes(CustomerAccountDetails Customeraccounts, String accttype) {
	
	return "inserted successfully";
	}
	public String deleteNotes() {
	
	return "deleted successfully";
	} 
	public Optional<TranscationDetails> findByttype(String type) {
	
	return findByttype(type);
	}
	}
