package com.manager.service;

import java.util.List;
import java.util.Optional;

import com.manager.model.CustomerAccountDetails;
import com.manager.model.TranscationDetails;

public interface ManagerService {
	
	
	public List findAllCustomerAccounts();
	public String insertNotes(CustomerAccountDetails Customeraccounts,String accttype);
	public String deleteNotes();
	public Optional<TranscationDetails> findByttype(String ttype);
	public void deleteCustomer(int cid);
	

}
