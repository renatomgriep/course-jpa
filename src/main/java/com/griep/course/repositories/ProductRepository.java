package com.griep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.griep.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
