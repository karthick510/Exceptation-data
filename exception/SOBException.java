package com.onesoft.exception;

public class SOBException {
	public static void main (String [] args) {
		String a= ("Singh");
		try {
			System.out.println(a.charAt(5));
		}catch (Exception x) {
			x.printStackTrace();
		}
	}

}
