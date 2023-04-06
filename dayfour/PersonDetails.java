package com.onesoft.dayfour;

public class PersonDetails {
	public static void main(String [] args) {
		String name=args[0];
		int id=Integer.parseInt(args[1]);
		char initial=args[2].charAt(0);
		boolean isPresent=Boolean.parseBoolean(args[3]);
		System.out.println("Name="+name+" Intial="+initial);
		
		
	}

}
