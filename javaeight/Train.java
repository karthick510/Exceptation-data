package com.onesoft.javaeight;

public interface  Train {
	public int speed (int speed);
	public static boolean Mailexpress(boolean ismailexpress) {
		return ismailexpress;
	}
	public default int length() {
		return 850;
	}
	public String brand(String brand);
	}
	


