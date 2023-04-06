package com.onesoft.oopsthree;

public class Cardiologist extends Doctor{
	public void sleep(String hour) {
		System.out.println(hour);
	}
	public void walk(int speed) {
		System.out.println(speed);
		}
	public void workForLiving (String job) {
		System.out.println(job);
	}
	public void showSalary(int experience) {
		if(experience>0 && experience<4 ) {
			System.out.println("4,50,000 per annum");
		}
		else {
			System.out.println("7,80,000 per annum");
		}
		
	}

}
