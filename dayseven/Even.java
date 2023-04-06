package com.onesoft.dayseven;

public class Even {
	public static void main (String [] args) {
		int [] nums= {22,23,24,25,26,27,28,29,30,31,32};
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if (nums[i]%2!=0) {
				count++;
				System.out.println(nums[i]);
			}
		}
		System.out.println("Count="+count);
	}

}


