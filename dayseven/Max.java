package com.onesoft.dayseven;

public class Max {
	public static void main (String [] args) {
		int [] nums={25,11,7,75,56};
		int max=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		System.out.println("Largest element present in the given array="+max);
		
	}

}
