package com.onesoft.function;

public class UseCalculator {
	public static void main(String [] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(10, 5, 3));
		System.out.println(c.sub());
		c.multi(10, 2);
		c.div();
		
	}

}
