package com.vcube.customerportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.repo.CustomerRepo;

//how to do
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo cr;

	@Override
	public Customer createCustomerData(Customer c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	@Override
	public List<Customer> getCustomerInfo() {
		// TODO Auto-generated method stub
		
		return cr.findAll();
	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer c,Integer Id) {
		// TODO Auto-generated method stub
		Customer cfdb=getCustomer(Id);
		cfdb.setAge(c.getAge());
		cfdb.setCity(c.getCity());
		cfdb.setEmail(c.getEmail());
		cfdb.setName(c.getName());
		cfdb.setPhone(c.getPhone());
		cfdb.setState(c.getState());
		return cr.save(cfdb);
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		 if (cr.existsById(id)) {
		        cr.deleteById(id);
		        System.out.println("Customer deleted successfully");
		    } else {
		        System.out.println("Customer ID not found");
		    }
		
	}

	@Override
	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
		return cr.findByEmail(email);
	}

	


	

}
