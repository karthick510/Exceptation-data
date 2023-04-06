package com.onesoft.dayseven;

public class Highest {
	public static void main (String [] args) {
		String [] names= {"ravi","krishna","kavimani"};
		int max=names.length;
		for(int i=0; i<names.length; i++) {
		if(names[i].length()>=max) {
			max=names[i].length();
		}
		}
		System.out.println(max);
	}

}
