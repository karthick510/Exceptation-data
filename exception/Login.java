package com.onesoft.exception;

public class Login {
	String password;
	public void checkPassword (String Password) throws PasswordException,Exception{
		if (Password.length()>=8) {
		System.out.println("Login Successfully");
	}
		else {
			throw new PasswordException("Must contain more than 8 Character");
		}
	}

}
