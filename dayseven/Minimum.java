package com.onesoft.dayseven;

public class Minimum {
	public static void main (String [] args) {
		int [] nums={-5,25,11,7,75,56};
		int mini=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<mini) {
				mini=nums[i];
			}
		}
		System.out.println("Smallest element present in the given array="+mini);
		
	}

}



