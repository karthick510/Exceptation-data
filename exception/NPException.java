package com.onesoft.exception;

public class NPException {
	public static void main (String [] args) {
		String a=null;
		try {
			System.out.println(a.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
