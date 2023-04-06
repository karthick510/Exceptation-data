package com.onesoft.collectionthree;

public class Student {
	private String name;
	private int rollNum;
	private char section;
	private int avg;
	private boolean isPresent;
	private String bloodGroup;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Student(String name, int rollNum, char section, int avg, boolean isPresent, String bloodGroup) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.section = section;
		this.avg = avg;
		this.isPresent = isPresent;
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", section=" + section + ", avg=" + avg
				+ ", isPresent=" + isPresent + ", bloodGroup=" + bloodGroup + "]";
	}

}
