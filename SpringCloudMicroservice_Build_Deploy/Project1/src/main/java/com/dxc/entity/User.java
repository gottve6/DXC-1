package com.dxc.entity;

public class User {

	private String uid;
	private String firstName;
	private String LastName;
	private String email;

	public User() {

	}

	public User(String uid, String firstName, String lastName, String email) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
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

}
