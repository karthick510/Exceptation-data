package com.onesoft.function;

public class UseStudentAverage {
	public static void main (String [] args) {
		StudentAverage s=new StudentAverage();
		System.out.println(s.total(80,90,70,85,88));
		s.average(80, 90, 70, 85, 88);
	}

}
