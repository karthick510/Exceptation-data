package com.onesoft.exception;

public class CheckVoterAge {
	public static void main (String [] args) throws AgeException,Exception {
    int age=10;
    try {
    	if (age>=18) {
    		System.out.println("Eligibile to vote");
    	}
    	else {
    		throw new AgeException("Not Eligible to vote");
    	}
    }catch (Exception x) {
    	System.out.println(x);
    }
    }
    
}
