package com.web.BackendApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.BackendApi.model.UserEmail;

public interface EmailRepository extends JpaRepository<UserEmail, String>{
	List<UserEmail> findByFrom(String from);
}
