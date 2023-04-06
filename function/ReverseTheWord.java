package com.onesoft.function;

public class ReverseTheWord {
	public String reverseword (String name) {
		String temp=" ";
				for(int i=name.length()-1; i>=0; i--) {
					temp=temp+name.charAt(i);
								}
				return temp;
				
		
	}

}
