package com.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.manager.model.CustomerAccountDetails;

@Repository
	public interface ManagerRepository extends JpaRepository<CustomerAccountDetails,Integer>{
	@Query("select u from CustomerAccounts u where u.cid=?1")
	public List findAllCustomerAccounts(int cid);
	

}
