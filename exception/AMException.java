package com.onesoft.exception;

public class AMException {
	public static void main (String [] args) {
		try {
			int a=10;
			int b=0;
			int div=a/b;
			System.out.println(div);
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			System.out.println("Not Valid Program");
		}
		
	}

}
