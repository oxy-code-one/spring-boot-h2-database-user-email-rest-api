package com.web.BackendApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.BackendApi.model.User;


public interface UserRepository extends JpaRepository<User, String>{
	User findByEmailAddress(String emailAddress);
}
