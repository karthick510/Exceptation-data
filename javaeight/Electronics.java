package com.onesoft.javaeight;

public interface Electronics {
	public int resaleAmt (int price);
	public default String onoff(boolean ison) {
		if(ison==true) {
			return "Product is working";
		}
		else {
			return "Product is not working";
		}
	}

}
