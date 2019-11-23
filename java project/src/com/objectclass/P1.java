package com.objectclass;

public class P1 {

	public static void main(String[] args) {
		int i=10;
		Integer i1=new Integer(i);
		Integer i2=new Integer(100);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(10));
	}

}
