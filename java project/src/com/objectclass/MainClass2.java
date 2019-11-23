package com.objectclass;

public class MainClass2 {
	public static void main(String[] args) {
		Demo1 ob1=new Demo1(10,12.0);
		Demo1 ob2=new Demo1(10,12.0);
		Demo2 ob3=new Demo2(10,12.0,'a',"hello");
		Demo2 ob4=new Demo2(10,12.0,'a',"hello");
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
	}

}
