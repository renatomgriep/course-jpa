package com.griep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.griep.course.entities.User;

public interface UsersRepository extends JpaRepository<User, Long> {

}
