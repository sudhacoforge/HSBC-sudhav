package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.service.ManagerService;

public class ManangersController {
	
	@RestController
	@RequestMapping("/manager")
	public class ManagerController<CustomerAccounts> {
		@Autowired
		ManagerService service;
		@GetMapping("/all")
		public List findAllCustomerAccounts(){
		return service.findAllCustomerAccounts();
		
		@DeleteMapping("/delete/id")
		public ResponseEntity<?>deleteCustById(@PathVariable("id") int cid){
		ResponseEntity<?> resp = null;
		service.deleteCustomer(cid);
		resp = new ResponseEntity<String>("customer = "+cid+" deleted", HttpStatus.OK);



		return resp;
		
		}
		}


}
