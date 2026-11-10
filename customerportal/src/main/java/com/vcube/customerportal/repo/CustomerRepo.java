package com.vcube.customerportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.customerportal.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {


	


	Customer findByEmail(String email);

	

}
