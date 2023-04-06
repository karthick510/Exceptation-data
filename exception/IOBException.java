package com.onesoft.exception;

public class IOBException {
	public static void main (String [] args) {
		String [] a= {"ravi","kavi","suresh"};
		try {
			System.out.println(a[4]);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
