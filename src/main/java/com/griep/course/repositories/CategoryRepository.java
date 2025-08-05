package com.griep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.griep.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
