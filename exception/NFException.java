package com.onesoft.exception;

public class NFException {
	public static void main (String [] args) {
		String a="Singh";
		int b=Integer.parseInt(a);
		try {
			System.out.println(a);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
