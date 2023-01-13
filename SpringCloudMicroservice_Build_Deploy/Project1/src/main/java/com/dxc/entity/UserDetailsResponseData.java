package com.dxc.entity;

public class UserDetailsResponseData {

	private String firstName;
	private String LastName;
	private String email;
	private String password;
	
	public UserDetailsResponseData(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
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
	
	
	
	
}
