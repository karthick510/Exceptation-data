package com.onesoft.daythree;

public class ToSeparateTheWord {
	public static void main(String [] args) {
		String word="Hello,World";
		String [] values=word.split(",");
		int wordnew=values.length;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(wordnew);
		
	}

}
