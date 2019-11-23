package com.staticmember;

public class Demo3 {
	static int i;
	static
	{
		System.out.println("from sib");
		System.out.println(i);
		i=20;
	}

	public static void main(String[] args) {
		System.out.println("to main");
		System.out.println(i);
		// TODO Auto-generated method stub

	}

}
