package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column (name="userId")
	private int theatreId;
	
	@Column(name="theatreName")
	private String theatreName;
	@Column(name="fullName")
	private String fullName;
	
	@Column (name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="location")
	private String location;
	@Column(name="about")
	private String about;
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Admin [theatreName=" + theatreName + ", fullName=" + fullName + ", email=" + email + ", password="
				+ password + ", location=" + location + ", about=" + about + "]";
	}

}
