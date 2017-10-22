package com.example.taxiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.taxiapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
