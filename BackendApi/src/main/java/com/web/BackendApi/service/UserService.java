package com.web.BackendApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.BackendApi.dao.UserRepository;
import com.web.BackendApi.model.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public ResponseEntity<User> createUser(User user) {
		Optional<User> registered = userRepo.findById(user.getEmailAddress());
		if(registered.isEmpty()) {
			return new ResponseEntity<>(userRepo.save(user), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
		}
	}
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
	}
	public ResponseEntity<User> getUser(String email) {
		return new ResponseEntity<>(userRepo.findByEmailAddress(email) , HttpStatus.OK);
	}
}
