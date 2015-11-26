package net.codejava.spring.model;

import java.util.Date;

public class User {
	private String username;
	private String password;
	private String email;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private UserType userType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {return password; }

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() { return birthDate; }

	public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
