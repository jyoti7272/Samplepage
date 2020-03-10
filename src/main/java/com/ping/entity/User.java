package com.ping.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "satyender1")
public class User implements Serializable {
	
	@Id
	@Column(name = "user_name")
	private String userName;
	

	@Column(name = "pwd")
	private String password;
	

	@Column(name = "email")
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
}
