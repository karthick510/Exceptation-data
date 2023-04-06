package com.onesoft.oopsthree;

public class SmartPhone implements Phone {
	public String brand(String brand) {
		return brand;
	}
	public boolean videocall(boolean isAvailable) {
		return isAvailable;
	}
	public boolean connectivity(boolean isAvailable) {
		return isAvailable;
	}
	public boolean voicecall(boolean isAvailable) {
		return isAvailable;
	}
	public void camerafunction(String tapping) {
		switch (tapping) 
		{
		case "single tapping":System.out.println("Taking Pictures");break;
		case "double tapping":System.out.println("Zooming");break;
		case "continues tapping":System.out.println("Continous Shots");break;
		default:System.out.println("Invalid data");break;
		}
		
	}

}
