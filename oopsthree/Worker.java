package com.onesoft.oopsthree;

public abstract class Worker {
	String name;
	int id;
	int workingHours;
	int salaryPerHour;
	public abstract void getwork(String job);
	public abstract void calculateSalary(int workingHours, int salaryPerHour);

}
