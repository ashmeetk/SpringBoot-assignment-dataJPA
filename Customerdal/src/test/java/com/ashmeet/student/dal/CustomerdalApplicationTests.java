package com.ashmeet.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ashmeet.student.dal.entities.Customer;
import com.ashmeet.student.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {
	
	@Autowired
	CustomerRepository repo;

//	@Test
//	void testCreateCustomer() {
//		Customer customer = new Customer();
//		customer.setEmail("ashmeet.kaur@sap.com");
//		customer.setName("Ashmeet");
//		repo.save(customer);
//	}

//	@Test
//	void testGetCustomerById() {
//		Customer customer = repo.findById(1l).get();
//		System.out.println(customer);
//	}
	
	@Test
	void testDeleteCustomer() {
		Customer customer = repo.findById(1l).get();
		repo.delete(customer);
		
	}
	
//	@Test
//	void testUpdateCustomer() {
//		Customer customer = repo.findById(1l).get();
//		customer.setEmail("ashmeet.com");
//		repo.save(customer);
//	}
}
