package com.onesoft.javaeight;

public class UseFindValues {
	public static void main (String [] args) {
		Method m=new Method ();
		FindValues maximum=m::findMax;
		int [] a= {12,15,24,48,75};
		maximum.findArray(a);
		
		FindValues min=m::findMini;
		min.findArray(a);
		
	}

}
