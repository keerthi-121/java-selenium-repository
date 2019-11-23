package com.abstraction;

public class MainClass1 {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(10);
		System.out.println(s.area());
		s=new Rectangle(10,20);
		System.out.println(s.area());
		s=new RightAngledTriangle(20,30);
		System.out.println(s.area());
	}

}
