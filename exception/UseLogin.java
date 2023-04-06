package com.onesoft.exception;

public class UseLogin {
	public static void main (String [] args) throws PasswordException, Exception {
		Login x=new Login ();
		x.checkPassword("ka5100");
	}

}
