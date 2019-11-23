package com.staticmember;

public class P1 {
	int i;
	static int add(int a)
	{
		int b=new P1().i+a;
				return b;
	}

	public static void main(String[] args) {
		
		int a=P1.add(10);
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
