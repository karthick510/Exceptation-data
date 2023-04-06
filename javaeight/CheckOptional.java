package com.onesoft.javaeight;

import java.util.Optional;

public class CheckOptional {
	public static void main (String [] args) {
		String a="karthick";
		Optional op=Optional.ofNullable(a);
		if(op.isPresent()) {
			System.out.println(a.toUpperCase());
		}
	
	else {
		System.out.println("DB is Null");
	}
	System.out.println(op.orElse("Out of Stock"));
	
	}
}
