package com.onesoft.oopsthree;

public class Teacher implements Employee {
	public String name (String a) {
		return a;
	}
	public String id (int b) {
		if (b%2==0) {
			return (b+"Is Even Number");
		}
		
			else {
				return (b+"Is Odd Number");
		}
	}
	public boolean isMale (boolean c) {
		return c;
	}

}
