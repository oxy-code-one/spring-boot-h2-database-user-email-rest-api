package com.web.BackendApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usr")
public class User {
	
	@NotBlank(message="First Name can't be empty")
	@Size(max=40, message="First Name should be Under  40 characters.")
	private String firstName;
	
	@NotBlank(message="Last Name can't be empty")
	@Size(max=40, message="Last Name should be Under  40 characters.")
	private String lastName ;
	
	@Id
	@Email(message="Invalid Email")
	private String emailAddress;
	
	@NotBlank(message="Phone Number can't be empty")
	@Size(min = 10, max = 10, message = "10 Digit number required")
	@Pattern(regexp="(^$|[0-9]{10})" ,message="Invalid Number")
	private String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
