package com.onesoft.daysix;

public class Paliyandrom {
	public static void main (String [] args) {
		String a="Mom";
		String temp="";
		for(int i=a.length()-1; i>=0; i--) {
			temp=temp+a.charAt(i);
		}
		if(a.equalsIgnoreCase(temp)) {
			System.out.println(temp);
		}
		
	}

}
