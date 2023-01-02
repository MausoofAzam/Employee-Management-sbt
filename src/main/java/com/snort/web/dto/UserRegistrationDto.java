package com.snort.web.dto;

import java.util.Set;

import javax.persistence.Column;

public class UserRegistrationDto {

	private String firstName;
	private String lastName;
	private String email;
	@Column(length = 6)
	private String password;
	private Set<String> role;
	
	public UserRegistrationDto() {
		// TODO Auto-generated constructor stub
	}


	public UserRegistrationDto(String firstName, String lastName, String email, String password, Set<String> role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
	}


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
	
}
