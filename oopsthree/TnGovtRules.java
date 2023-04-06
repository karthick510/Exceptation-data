package com.onesoft.oopsthree;

public class TnGovtRules extends CentralGovtRules{
	public void displaynoplatecolor(String vehicletype) {
		if(vehicletype.equals("Private")) {
			System.out.println("Black & White");
		}
		else if(vehicletype.equals("Public")) {
			System.out.println("Black & Yellow");
		}
		else if(vehicletype.equals("Electrical")) {
			System.out.println("Green & White");
		}
		else {
			System.out.println("Invalid Data");
		}
	}
	public void statecode (String statecode) {
		System.out.println(statecode);
	}

}
