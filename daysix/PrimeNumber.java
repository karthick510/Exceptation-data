package com.onesoft.daysix;

public class PrimeNumber {
	public static void main (String [] args) {
		int num=5;
		boolean isPrime=true;
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				isPrime = false;
			}
		}
			if(isPrime==true) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("It is not a prime number");
				
			}
	}
			
}
