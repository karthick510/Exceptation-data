package com.onesoft.javaeight;

public class Mobile implements Electronics{
	public int resaleAmt (int price) {
		return price/2;
	
	}
	public String onoff(boolean ison) {
		if (ison!=true) {
			return "working";
		}
		else {
			return "Display gone";
		}
	}

}
