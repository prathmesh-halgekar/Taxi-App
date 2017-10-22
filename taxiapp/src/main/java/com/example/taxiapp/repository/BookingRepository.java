package com.example.taxiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.taxiapp.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
