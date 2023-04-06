package com.onesoft.javaeight;

public class UsePositiveNumber {
	public static void main (String [] args) {
		int[] a= {1,5,-6,8,10-8};
		PositiveNumber find= (c)->{
			for(int i=0; i<c.length; i++) {
				if (c[i]>0) {
					System.out.println (c[i]);
				}
							}
				
		};
     find.num(a);
	}
}
