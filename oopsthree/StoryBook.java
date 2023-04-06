package com.onesoft.oopsthree;

public class StoryBook implements Book {
	public void name (String a) {
		System.out.println(a);
	}
	public void price (int b) {
		System.out.println(b);
	}
	public void authorname (String c) {
		System.out.println(c);
	}
	public void publishyear (int d) {
		if(d>1990) {
			System.out.println("Interesting");
		}
		else {
			System.out.println("Not Interesting");
		}
	}

}
