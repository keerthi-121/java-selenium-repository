package com.staticmember;

public class Demo4 {
	static
	{
		System.out.println("from sib");
	}

	public static void main(String[] args) {
		System.out.println("to main");
	}
	static {
		System.out.println("from sib2");
		// TODO Auto-generated method stub

	}

}
