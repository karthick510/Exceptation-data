package com.onesoft.javaeight;

public class UseWatch {
	public static void main (String [] args) {
		Watch fasttrack= (price)->{if(price>1200) {
			return "SmartWatch";
		}
		else {
			return "Normal watch";
		}
		
		};
		System.out.println(fasttrack.findtype(1500));
	}
}
	


