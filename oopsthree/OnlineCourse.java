package com.onesoft.oopsthree;

public class OnlineCourse implements Course {
	public String courseTrainerName(String name) {
		return name;
	}
	public int courseHours(int noofhours) {
		return noofhours;
	}
	public boolean courseisOnline(boolean isOnline) {
		return isOnline;
	}
	
	public String courselink(String urllink) {
		return urllink;
	}
	
	public String courseFees(String courseName) {
		if (courseName.equals("java")) {
			return ("Fees is 20K");
		}
		else if (courseName.equals("SQL")) {
			return ("Fees is 15K");
		}
		else if (courseName.equals("Python")) {
			return ("Fees is 18K");
		}
		else {
			return("Not Available");
			
		}
	}

}
