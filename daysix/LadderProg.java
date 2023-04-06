package com.onesoft.daysix;

public class LadderProg {
	public static void main(String [] args) {
		int a=0;
		int b=0;
		int c=0;
		for(int i=-25; i<=25; i++) {
			if(i>0) {
				a++;}
				else if (i<0) {
					b++; }
				else  {
					c++;
				}
			System.out.println("Count="+a);
			System.out.println("Count="+b);
			System.out.println("Count="+c);
				
			}
		}
	}


