package com.polymorphism;

public class MainClass1 {

	public static void main(String[] args) {
		A ob;
		ob=new A();
		ob.test();//from A
		ob=new B();//upcasting
		ob.test();//polymorphism

	}

}
