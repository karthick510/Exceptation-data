package com.onesoft.dayfour;

public class CommaSeparatorprg {
	public static void main(String [] args) {
		String [] a=args[0].split(",");
		int num1=Integer.parseInt(a[0]);
		int num2=Integer.parseInt(a[1]);
		String [] b=args[1].split(",");
		int num3=Integer.parseInt(b[0]);
		int num4=Integer.parseInt(b[1]);
		System.out.println((num1+num2)*(num3+num4));
	}

}
