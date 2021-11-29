package com.reobotnet.hr_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reobotnet.hr_user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}