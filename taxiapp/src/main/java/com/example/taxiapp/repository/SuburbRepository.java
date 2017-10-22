package com.example.taxiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.taxiapp.model.Suburb;

public interface SuburbRepository extends CrudRepository<Suburb, Integer> {

}
