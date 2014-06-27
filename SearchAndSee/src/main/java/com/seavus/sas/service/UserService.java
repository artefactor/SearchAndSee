package com.seavus.sas.service;

import com.seavus.sas.model.User;

public class UserService {

	private final String userID = "admin";
	private final String password = "2222";
	private final String userName = "Vasa";
	public User getUser(String user, String pwd) {
		//XXX
		boolean equalsPass = password.equals(pwd);
//		boolean equalsPass = true;
		
		boolean b = userID.equals(user) && equalsPass;
		if (b)
			return new User(userID, password,userName);
		else {
			return null;
		}
	}
}