package com.web.BackendApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.BackendApi.service.EmailService;
import com.web.BackendApi.service.UserService;
import com.web.BackendApi.model.User;
import com.web.BackendApi.model.UserEmail;

@RestController
public class ApiController {
	
	@Autowired
	UserService userService;
	@Autowired
	EmailService emailService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
		return userService.createUser(user);
	}
	@GetMapping("/users")
	public ResponseEntity<List<User>> returnUsers() {
		return userService.getUsers();
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<User> returnUser(@PathVariable("id") String id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/email")
	public ResponseEntity<UserEmail> createEmail(@RequestBody @Valid UserEmail userEmail) {
		return emailService.createEmail(userEmail);
	}
	@GetMapping("/emails/count")
	public ResponseEntity<Integer> returnEmailCount(@RequestParam("user") String userID) {
		return emailService.getEmailCount(userID);
	}
}
