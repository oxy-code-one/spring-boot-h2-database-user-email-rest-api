package com.web.BackendApi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.BackendApi.dao.EmailRepository;
import com.web.BackendApi.model.UserEmail;

@Service
public class EmailService {
	@Autowired
	EmailRepository emailRepo;
	
	public ResponseEntity<UserEmail> createEmail(UserEmail userEmail) {
		return new ResponseEntity<>(emailRepo.save(userEmail), HttpStatus.OK);
	}
	public ResponseEntity<Integer> getEmailCount(String email) {
		return new ResponseEntity<>(emailRepo.findByFrom(email).size(), HttpStatus.OK);
	}
}
