package com.onesoft.dayseven;

public class Count {
	public static void main (String [] args) {
		float [] ages=new float [3];
		ages[0]=28.6f;
		ages[1]=17.3f;
		ages[2]=45.8f;
		int count=0;
		for(int i=0; i<ages.length; i++) {
			count++;
		}
		System.out.println(count);
		
	}

}


