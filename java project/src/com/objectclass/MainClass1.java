package com.objectclass;

public class MainClass1 {
	public static void main(String[] args) {
		A1 ob1=new A1(10,20.0);
		A1 ob2=new A1(100,20.0);
		A1 ob3=new A1(100,20.0);
		B1 ob4=new B1(10,20.0,"hi",'a');
		B1 ob5=new B1(10,20.0,"hi",'e');
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
		System.out.println(ob3.equals(ob2));
		System.out.println(ob4.equals(ob5));
		System.out.println(ob5.equals(ob4));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println(ob5.hashCode());
	}

}
