package com.onesoft.daysix;

public class Average {
	public static void main(String [] args) {
		int add=0;
		int count=0;
		for(int i=1; i<=5; i++) {
			add=add+i;
			count++;
			}
		System.out.println(add/count);
	}

}
