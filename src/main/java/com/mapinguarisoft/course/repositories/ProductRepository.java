package com.mapinguarisoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mapinguarisoft.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
