package com.onesoft.daysix;

public class newtwo {
	public static void main(String [] args) {
	String a="TN07YZ3";
	int count=0;
	for(int i=0; i<a.length(); i++) {
		if(a.charAt(i)>='0' && a.charAt(i)<='9') {
			count++;
						}
	}
	System.out.println(count);
}

}


