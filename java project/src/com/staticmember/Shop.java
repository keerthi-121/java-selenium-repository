package com.staticmember;

public class Shop {
	public static void main(String[] args) {
		System.out.println("Marker colour "+Marker.colour+" Marker price"+Marker.price);
		Marker.colour="red";
		Marker.price=50;
		Marker.colour="orange";
		Marker.price=20;
		Marker.writing();
		System.out.println("Marker colour "+Marker.colour+" Marker price"+Marker.price);
		
	}
	
	
	
	
}
