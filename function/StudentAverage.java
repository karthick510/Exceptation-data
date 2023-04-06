package com.onesoft.function;

public class StudentAverage {
	public int total(int tam,int eng,int mat,int sci,int soc) {
		return tam+eng+mat+sci+soc;
	}
	
	public void average(int tam,int eng,int mat,int sci,int soc) {
		System.out.println((tam+eng+mat+sci+soc)/5);
	}

}
