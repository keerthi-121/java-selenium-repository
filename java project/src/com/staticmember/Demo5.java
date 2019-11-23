package com.staticmember;

public class Demo5 {
	static void m1()
	{
		System.out.println("from atatic method");
	}

	public static void main(String[] args) {
		m1();
		Demo5.m1();
		// TODO Auto-generated method stub

	}

}
