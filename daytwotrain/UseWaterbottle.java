package com.onesoft.daytwotrain;

public class UseWaterbottle {
	public static void main(String [] args) {
		WaterBottle w=new WaterBottle();;
		w.colour="Blue";
		w.litre=2;
		w.isPlastic=true;
		w.price=30;
		w.brand="Aquafina";
		System.out.println(w.colour+" "+w.litre+" "+w.isPlastic+" "+w.price+" "+w.brand);
		
	}

}
