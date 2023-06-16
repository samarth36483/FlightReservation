package com.samarth.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samarth.flightreservation.reservation.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
