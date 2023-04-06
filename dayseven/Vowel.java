package com.onesoft.dayseven;

public class Vowel {
	public static void main (String [] args) {
		String [] names= {"krishearth"};
		int count=0;
		for(int i=0; i<names.length; i++) {
			if(names[i]=="a"||names[i]=="e"||names[i]=="i"||names[i]=="o"||names[i]=="u") {
		
			count++;
			//System.out.println(names[i]);
			}	
		}
		System.out.println("Count="+count);
	}
}


