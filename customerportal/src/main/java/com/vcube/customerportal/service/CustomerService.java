package com.vcube.customerportal.service;

import java.util.List;

import com.vcube.customerportal.model.Customer;

public interface CustomerService {
	//create customer data and import inside it
	Customer createCustomerData(Customer c);
//get all customer data
	 List<Customer> getCustomerInfo();
	
//get comtomer data based onid 
	 Customer getCustomer(Integer id);
	 //update all tge customer data
	 Customer updateCustomer(Customer c,Integer id) ;
	 //delete customer data based on id 
	void deleteCustomer(Integer id);
	Customer findByEmail(String email);
	
}
