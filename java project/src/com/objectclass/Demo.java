package com.objectclass;

public class Demo {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3="hi";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("hi".equals("Hi"));
		System.out.println("hi".equalsIgnoreCase("HI"));
	}

}
