package com.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.manager.model.TranscationDetails;

@Repository
public interface TranscationRepository extends JpaRepository<TranscationDetails, Integer>{
	
	
	@Query("select u from Transaction u where u.cid=?1")
	public List findAllCustomerAccounts(int cid);
	

}
