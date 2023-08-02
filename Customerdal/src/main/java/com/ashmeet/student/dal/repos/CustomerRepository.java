package com.ashmeet.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ashmeet.student.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
