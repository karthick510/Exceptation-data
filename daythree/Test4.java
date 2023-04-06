package com.onesoft.daythree;

public class Test4 {
	public static void main(String [] args) {
		String word="Chennai/India";
		String [] values=word.split("/");
		String result1= values[0].toUpperCase();
		String result2= values[1].toLowerCase();
		int result3=values.length;
		char letters=word.charAt(8);
		System.out.println(result1+" "+result2+" "+result3+" "+letters);
		
		
	}

}
