package com.onesoft.zhomework;

public class Bike {
	private int numberplate;
	private String color;
	private String brand;
	public int getNumberplate() {
		return numberplate;
	}
	public void setNumberplate(int numberplate) {
		this.numberplate = numberplate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Bike(int numberplate, String color, String brand) {
		super();
		this.numberplate = numberplate;
		this.color = color;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bike [numberplate=" + numberplate + ", color=" + color + ", brand=" + brand + "]";
	}
	

}
