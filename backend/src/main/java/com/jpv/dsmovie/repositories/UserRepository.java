package com.jpv.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
}
