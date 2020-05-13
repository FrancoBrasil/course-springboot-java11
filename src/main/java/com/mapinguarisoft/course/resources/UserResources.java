package com.mapinguarisoft.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapinguarisoft.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Vanessa Linda Brasil", "vanessa_linda@gmail.com", "(16)99194-0494", "H0l@nd35");
		return ResponseEntity.ok().body(u);
	}

}
