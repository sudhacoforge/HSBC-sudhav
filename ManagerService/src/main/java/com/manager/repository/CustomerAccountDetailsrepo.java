package com.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.model.CustomerAccountDetails;

public interface CustomerAccountDetailsrepo extends JpaRepository<CustomerAccountDetails, Integer>{

}
