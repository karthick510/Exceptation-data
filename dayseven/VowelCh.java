package com.onesoft.dayseven;

public class VowelCh {
	public static void main (String [] args) {
		char [] letters= {'o','n','e','s','o','f','t','s'};
		int count=0;
		for(int i=0; i<letters.length; i++) {
			if(letters[i]=='a'||letters[i]=='e'||letters[i]=='i'||letters[i]=='o'||letters[i]=='u') {
				count++;
				System.out.println(letters[i]);
			}
		}
		System.out.println("Count="+count);
			
	}

}
