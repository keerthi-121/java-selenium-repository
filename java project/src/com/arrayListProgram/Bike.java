package com.arrayListProgram;

public class Bike {
	String color;
	double mileage;
	Bike(){}
	public Bike(String color, double mileage) {
		this.color = color;
		this.mileage = mileage;
	}
	public String toString()
	{
		return "["+color+","+mileage+"]";
	}
	

}
