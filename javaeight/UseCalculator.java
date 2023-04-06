package com.onesoft.javaeight;

public class UseCalculator {
	public static void main (String [] args) {
		Calculator add=(a,b)-> a+b;
		System.out.println(add.math(10,5));
		Calculator sub=(a,b)-> a-b;
		System.out.println(sub.math(10,5));
		Calculator multi=(a,b)-> a*b;
		System.out.println(multi.math(10,5));
		Calculator div=(a,b)-> a/b;
		System.out.println(div.math(10,5));
	}

}
