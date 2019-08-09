package com.example.Entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {

	private int user_id;
	private String firstName;
	private String lastName;
	private String employeeId;
	
	public User(int user_id, String firstName, String lastName, String employeeId) {
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}	
}
