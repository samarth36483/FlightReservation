package com.samarth.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samarth.flightreservation.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
