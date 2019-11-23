package com.staticmember;

public class Demo1 {
	static int i;
	static
	{
		System.out.println("from sib");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(Demo2.i);
	}

}
