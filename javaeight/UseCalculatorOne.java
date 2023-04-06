package com.onesoft.javaeight;

public class UseCalculatorOne {
	public static void main (String [] args) {
		CalculatorOne add=(a,b)->System.out.println(a+b);
		add.math(8, 4);
		CalculatorOne sub=(a,b)->System.out.println(a-b);
		sub.math(8, 4);
		CalculatorOne multi=(a,b)->System.out.println(a*b);
		multi.math(8, 4);
		CalculatorOne div=(a,b)->System.out.println(a/b);
		add.math(8, 4);
}
	}