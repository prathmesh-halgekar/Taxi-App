package com.example.taxiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.taxiapp.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
