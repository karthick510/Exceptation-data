package com.onesoft.exception;

public class CheckMail {
	public static void main (String [] args) throws MailNotFoundException,Exception{
		String mail="kk@mail.com";
		try {
			if(mail.endsWith("@gmail.com")||mail.endsWith("@yahoo.com")) {
				System.out.println("It is a Mail");
			}
			else {
				throw new MailNotFoundException("Not a Mail");
			}
		} catch (Exception c) {
			c.printStackTrace();
		}
		
	}

}
