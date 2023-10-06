package com.example.demouser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demouser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
