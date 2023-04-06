package com.onesoft.dayseven;

public class Lastletter {
	public static void main (String [] args) {
		String [] names= {"kumar","ravi","suresh"};
		for(int i=0; i<names.length; i++) 
		{
			System.out.println((names[i].charAt(names[i].length()-1)));
		}
	}

}


