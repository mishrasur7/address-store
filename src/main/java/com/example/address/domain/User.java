package com.example.address.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity class User
@Entity
public class User {
	
	//private fields with auto generated id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "username", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "hashedPassword", nullable = false)
	private String hashedPassword;
	
	@Column(name = "email", nullable = false)
	private String email; 
	
	@Column(name = "role", nullable = false)
	private String role;

	//constructor without fields and super class
	public User() {
		
	}
	
	//constructor using fields and super class
	public User(String userName, String hashedPassword, String email, String role) {
		super();
		this.userName = userName;
		this.hashedPassword = hashedPassword;
		this.email = email;
		this.role = role;
	}
	
	//getters and setters method

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	//toString method 
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", hashedPassword=" + hashedPassword + ", email=" + email
				+ ", role=" + role + "]";
	} 
	
	
}
