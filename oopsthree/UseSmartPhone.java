package com.onesoft.oopsthree;

public class UseSmartPhone {
	public static void main (String [] args) {
		SmartPhone x=new SmartPhone ();
		System.out.println(x.brand("OPPO"));
		System.out.println(x.videocall(true));
		System.out.println(x.connectivity(false));
		System.out.println(x.voicecall(true));
		x.camerafunction("double tapping");
	}

}
