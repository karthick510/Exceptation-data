package com.onesoft.daysix;

public class EvenStr {
	public static void main (String [] args) {
		String a="franklin";
		for(int i=0; i<a.length(); i=i+1) {
		if (i%2==0) {
			System.out.println(a.charAt(i));
			}
		}
	}

}
