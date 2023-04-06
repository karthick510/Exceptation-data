package com.onesoft.function;

public class MiniNameInArray {
	public String findMin(String[] a) {
		String min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
		return min;
	}

}
