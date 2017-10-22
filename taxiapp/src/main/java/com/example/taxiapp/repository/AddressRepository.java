package com.example.taxiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.taxiapp.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
