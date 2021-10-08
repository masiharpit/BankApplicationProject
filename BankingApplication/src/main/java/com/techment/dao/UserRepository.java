package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
