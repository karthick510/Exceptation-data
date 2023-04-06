package com.onesoft.dayseven;

public class NewThree {
	public static void main (String [] args) {
		int [] nums= {101,25,135,150,250,450};
		for(int i=0; i<nums.length; i++){
			if(nums[i]>100) {
				System.out.println(nums[i]+1000);
			}
		}
		
	}

}
