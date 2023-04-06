package com.onesoft.daysix;

public class Good {
	public static void main(String [] args) {
		int count=0;
		for(int i=10; i>=0; i--) {
			if(i%2==0) {
			continue; }
			count++;
			System.out.println(i); 
		}
		System.out.println(count);
	}
	

}
