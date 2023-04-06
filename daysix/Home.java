package com.onesoft.daysix;

public class Home {
	public static void main (String [] args) {
		String a="FRANKLIN";
		String temp=(" ");
		for (int i=a.length()-1; i>=0; i--) {
			temp=temp+a.charAt(i);
			System.out.println(a.charAt(i));
		}
		System.out.println(temp);
	}

}
