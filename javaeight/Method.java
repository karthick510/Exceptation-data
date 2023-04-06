package com.onesoft.javaeight;

public class Method {
		public void findMax (int[] a) {
		int maximum=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>=maximum) {
				maximum=a[i];
			}
		}
		System.out.println(maximum);
	}
	public void findMini (int[] a) {
		int minimum=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<=minimum) {
				minimum=a[i];
			}
		}
		System.out.println(minimum);
	}

}
