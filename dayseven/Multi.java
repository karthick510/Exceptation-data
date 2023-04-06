package com.onesoft.dayseven;

public class Multi {
	public static void main (String [] args) {
		int [] ages=new int [3];
		ages[0]=28;
		ages[1]=17;
		ages[2]=45;
		int mul=1;
		for(int i=0; i<ages.length; i++) {
			mul=mul*ages[i];
		}
		System.out.println(mul);
	}

}

