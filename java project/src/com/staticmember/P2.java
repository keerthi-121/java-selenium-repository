package com.staticmember;

public class P2 {
	static int i;
	static int add(int a)
	{
		int b=P2.i+a;
				return b;
	}

	public static void main(String[] args) {
		
		int a=P2.add(10);
		System.out.println(a);
	}

}
