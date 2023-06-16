package com.samarth.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samarth.flightreservation.passenger.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
