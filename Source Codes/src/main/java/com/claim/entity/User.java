package com.claim.entity;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column (name="userId")
	private int userId;
	
	@Column (name="fullName")
	private String fullName;
	@Column (name="email")
	private String email;
	@Column (name="password")
	private String password;
	@Column (name="nickName")
	private String nickName;
	@Column (name="location")
	private String location;

	@Column (name="subscriptions")
	private ArrayList<String> subscriptions = new ArrayList<String>();
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<String> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(ArrayList<String> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", email=" + email + ", password=" + password + ", nickName=" + nickName
				 + ", location=" + location + "]";
	}
	
	
	
	
}
