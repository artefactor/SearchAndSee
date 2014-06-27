package com.seavus.sas.model;

public class User {
	private String name = null;
	private String password = null;
	private String userName;

	public User(String name, String password, String userName) {
		
		this.name = name;
		this.password = password;
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
