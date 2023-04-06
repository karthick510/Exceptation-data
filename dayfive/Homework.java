package com.onesoft.dayfive;

public class Homework {
	public static void main(String [] args) {
		String a=args[0];
		char b=a.charAt(0);
		if (b=='N') {
			System.out.println("NORTH");
		}
		else if (b=='S') {
			System.out.println("SOUTH");
		}
		else if (b=='W') {
			System.out.println("WEST");
		}
		else {
			System.out.println("EAST");
		}
	
	}
}
