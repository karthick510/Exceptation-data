package com.onesoft.n;

public class UseClass {
	public static void main (String [] args) {
	AxisBank a1=new AxisBank ();
	a1.amount=5000;
	System.out.println(a1.findLoanAmount(a1.amount));

}
}