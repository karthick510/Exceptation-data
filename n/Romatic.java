package com.onesoft.n;

public class Romatic extends Movie{
	public class Movie {
		
		public String findRating(int fight) {
		if(fight==5) {
			return("Bad");
			}
		else if(fight==4) {
			return("Average");
		}
		else if(fight==3) {
			return("Ok");
		}
		else {
			return("Good");
		}

	}
	}

}
