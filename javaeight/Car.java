package com.onesoft.javaeight;

public interface Car {
	public void brand(String brand);
	public static void findNetPrice (int price) {
		System.out.println(price+(price*10/100));
	}

}
