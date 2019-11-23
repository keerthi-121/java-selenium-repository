package com.staticmember;

public class Demo6 {
	static int i;

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		System.out.println(Demo6.i);
		Demo5.m1();
		m2('a');
		System.out.println(Demo6.i);
		}
	static void m2(int i) {
		System.out.println(i);
		i=10;
		System.out.println(i);
	}

}
