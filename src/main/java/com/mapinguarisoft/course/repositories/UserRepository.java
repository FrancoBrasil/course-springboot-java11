package com.mapinguarisoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapinguarisoft.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
