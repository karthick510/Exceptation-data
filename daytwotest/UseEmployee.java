package com.onesoft.daytwotest;

public class UseEmployee {
	public static void main(String [] args) {
		Employee e1=new Employee();
		e1.employeeid=145;
		e1.employeeName="Arjun";
		e1.dateOfBirth="30.08.1985";
		e1.mobileNo=9645781235l;
		e1.countrycode="+91";
		System.out.println("EmployeeMno="+e1.countrycode+e1.mobileNo);
		
		Employee e2=new Employee();
		e2.employeeid=149;
		e2.employeeName="Krishna";
		e2.dateOfBirth="02.09.1988";
		e2.mobileNo=9746963215l;
		e2.countrycode="+91";
		System.out.println("EmployeeMno="+e2.countrycode+e2.mobileNo);
		
		
	}

}
