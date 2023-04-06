package com.onesoft.daythree;

public class HomeWork2 {
	public static void main (String [] args) {
		String word="Welcome-to-my-world";
		String []values=word.split("-");
		String result=values[0].concat(values[3]);
		System.out.println(result);
	}

}
