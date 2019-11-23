package com.arrayListProgram;

public class Intwrapper {
	public static void main(String[] args) {
		int i=10;
		Integer i1=new Integer(i);
		Integer i2=new Integer(100);
		Integer i3=100;
		Integer i4=100;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3.hashCode());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i2.equals(i3));
		System.out.println(i2==i3);
		System.out.println(i3==i4);
		
	}

}
