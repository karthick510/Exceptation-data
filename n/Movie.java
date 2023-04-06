package com.onesoft.n;

public class Movie {
	
	public String findRating(int fight) {
	if(fight==5) {
		return("Very Good");
		}
	else if(fight==4) {
		return("Good");
	}
	else if(fight==3) {
		return("Ok");
	}
	else {
		return("Very Bad");
	}

}
}
