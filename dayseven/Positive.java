package com.onesoft.dayseven;

public class Positive {
	public static void main (String [] args) {
		int [] nums= {-12,-11,-10,-4,0,0,5,13,17,18};
		int count=0;
		for(int i=0; i<nums.length; i++) {
		if (nums[i]>0) {
			count++;
			System.out.println(nums[i]);
		}
		}
		System.out.println("Count="+count);
			
		
	}

}
