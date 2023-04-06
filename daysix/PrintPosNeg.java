package com.onesoft.daysix;

public class PrintPosNeg {
	public static void main(String [] args) {
		int count=0;
		for(int i=-25; i<=25; i++) {
			if(i>0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count="+count);
	}

}
