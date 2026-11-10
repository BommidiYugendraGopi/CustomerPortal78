package com.vcube.customerportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.service.CustomerService;

@RestController
@RequestMapping("/customer")

//http://localhost:8080/customer/wel
public class CustomerController {

	@Autowired
	CustomerService cs;

//http://localhost:8080/customer/wel
	@GetMapping("/wel")
	String welcome() {
		return "hi ra";
	}

//http://localhost:8080/customer/create
	@PostMapping("/create")
	Customer createCustomernfo(@RequestBody Customer c) {
		System.out.println("hi");
		System.out.println("name" + c.getName());
		System.out.println("age :" + c.getAge());
		return cs.createCustomerData(c);

	}
	//http://localhost:8080/customer/allcustomerinfo
	@GetMapping("/allcustomerinfo")

	List<Customer> getallCustomer() {
		
		return cs.getCustomerInfo();
		
	}
	//http://localhost:8080/customer/fbi/15
	@GetMapping("/fbi/{id}")
	Customer getCustomer(@PathVariable Integer id) {
		return cs.getCustomer(id);
	}
	//http://localhost:8080/customer/fbe/yu@gmail.com
	@GetMapping("/fbe/{email}")
	Customer getCustomerbyemail(@PathVariable String email) {
		return cs.findByEmail(email);
	}
	//http://localhost:8080/customer/del/15
	@DeleteMapping("/del/{cid}")
	String deletebyid(@PathVariable Integer cid) {
		cs.deleteCustomer(cid);
		return cid +"data deleted";
	}
	//http://localhost:8080/customer/update/18
@PutMapping("/update/{id}")
Customer updatecustomer(@RequestBody Customer c,@PathVariable Integer id) {
	return cs.updateCustomer(c, id);
}
}
