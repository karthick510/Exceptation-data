package com.onesoft.dayseven;

public class NewFive {
	public static void main (String [] args) {
		String [] names= {"karthick","frank","kavi"};
		int max=names.length;
		String temp=" ";
		for(int i=0; i<names.length; i++) {
		if(names[i].length()>=max) {
			max=names[i].length();
			temp=names[i];
		}
		}
		System.out.println(temp);
	}

}


