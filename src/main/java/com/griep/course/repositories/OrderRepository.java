package com.griep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.griep.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
