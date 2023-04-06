package com.onesoft.daythree;

public class HomeWork {
	public static void main (String [] args) {
		String word="Welcome-to-my-world";
		String []values=word.split("-");
		String result1=values[2].toUpperCase()+values[3].toUpperCase();
		int result2=values.length;
		char letters=word.charAt(6);
		int result4=values[2].length();
		String result5=values[3].substring(1,4);
		String lap=values[3].toUpperCase();
		boolean result6=values[0].charAt(0)==(lap.charAt(0));
		int last=values[2].indexOf('y');
		System.out.println(result1+" "+result2+" "+letters+" "+result4+" "+result5+" "+result6+" "+last);
	}
	

}
