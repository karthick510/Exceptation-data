package com.onesoft.function;

public class FindMaximum {
	public int findMax() {
		int a=50;
		int b=30;
		int c=35;
		if(a>b && a>c) {
			return a;
		}
			else if(b>c && b>a) {
				return b;
			}
			else  {
				return c;
		}
	}

}
