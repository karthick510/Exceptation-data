package com.onesoft.daysix;

public class PrintOddNumber {
	public static void main (String [] args) {
		int count=0;
		for(int i=0; i<=50; i++) {
			if (i%2!=0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count="+count);
	}

}
