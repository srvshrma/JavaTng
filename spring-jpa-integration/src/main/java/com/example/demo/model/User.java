package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JsonIgnore
	private String uId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String securityNo;
	@JsonIgnore
	private Boolean isAdmin;
	@JsonIgnore
	private LocalDate craetionDate;
	public User() {
		super();
	}
	public User(Integer id, String uId, String firstName, String lastName, String email, String password,
			String securityNo, Boolean isAdmin, LocalDate craetionDate) {
		super();
		this.id = id;
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.securityNo = securityNo;
		this.isAdmin = isAdmin;
		this.craetionDate = craetionDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
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
	public String getSecurityNo() {
		return securityNo;
	}
	public void setSecurityNo(String securityNo) {
		this.securityNo = securityNo;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public LocalDate getCraetionDate() {
		return craetionDate;
	}
	public void setCraetionDate(LocalDate craetionDate) {
		this.craetionDate = craetionDate;
	}

	
}
