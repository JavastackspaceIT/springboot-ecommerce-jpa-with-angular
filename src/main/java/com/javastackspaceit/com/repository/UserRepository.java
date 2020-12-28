package com.javastackspaceit.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastackspaceit.com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}