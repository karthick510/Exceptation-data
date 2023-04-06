package com.onesoft.oopsthree;

public class Programmer extends Worker{
	public void getWork(String job) {
		System.out.println(job);
	}
	public void calculateSalary(int workingHours, int salaryPerHour) {
		int c=(workingHours*salaryPerHour);
		System.out.println(c);
	}

}
