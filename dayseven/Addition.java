package com.onesoft.dayseven;

public class Addition {
	public static void main (String [] args) {
		int [] ages=new int [3];
		ages[0]=28;
		ages[1]=17;
		ages[2]=45;
		int add=0;
		int count=0;
		for(int i=0; i<ages.length; i++) {
			add=add+ages[i];
			count++;
		}
		System.out.println(add/count);
	}

}



