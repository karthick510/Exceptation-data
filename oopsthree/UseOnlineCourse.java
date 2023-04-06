package com.onesoft.oopsthree;

public class UseOnlineCourse {
	public static void main (String [] args) {
		OnlineCourse x=new OnlineCourse();
		System.out.println(x.courseTrainerName("Nisha"));
		System.out.println(x.courseHours(4));
		System.out.println(x.courseisOnline(false));
		System.out.println(x.courselink("www.onesofts.in"));
		System.out.println(x.courseFees("SQL"));
	}

}
