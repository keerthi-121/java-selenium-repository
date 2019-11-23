package com.staticmember;

public class Demo2 {
	static int i;
	 static
	 {
		System.out.println("from sip2");
	 }

	public static void main(String[] args) {
		System.out.println("to main");
		System.out.println(Demo1.i);
		// TODO Auto-generated method stub

	}

}
