package com.im.project.model;

public class User {

	private Integer id;

	private String userName;

	private String password;

	public Integer getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}