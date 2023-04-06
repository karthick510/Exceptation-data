package com.onesoft.n;

public class ChMaxValue {
	public void findMax (int a) {
		if(a>10) {
			System.out.println(a+"is greater");
		}
		else {
		System.out.println(a+"is smaller");
	}
	}
		public void findMax (int a, int b) {
			if(a>b) {
				System.out.println(a+"is greater");
			}
			else {
			System.out.println(b+"is greater");
		}
		}
			public void findMax (int a,int b, int c) {
				if(a>b && a>c) {
					System.out.println(a+"is greater");
				}
				else {
				System.out.println(a+"is smaller");
			}
}
			public void findMax(String [] a) {
				int max=a[0].length();
				String temp=" ";
				for(int i=0; i<a.length; i++) {
					if(a[i].length()>max) {
						max=a[i].length();
						temp=a[i];
					}
				}
				System.out.println(temp);
			}
}
