package com.onesoft.exception;

public class RetrimentAge {
	public static void main (String [] args) throws AgeException,Exception {
		int age=55;
		try {
			if(age<=60) {
				throw new AgeException("Working");
			}
			else {
				System.out.println("Retriment");
			}
		} catch (Exception z) {
			System.out.println(z);
		}
	}

}
