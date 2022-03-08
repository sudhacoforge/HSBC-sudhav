package com.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Customer.module.Transaction;

public interface Transactionrep extends JpaRepository<Transaction, Integer> {

}
