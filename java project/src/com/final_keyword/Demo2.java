package com.final_keyword;

public class Demo2 {
	public static void main(String[] args) {
		test(10);
	}
	static void test( final int i)
	{
		System.out.println(i);
		//i=20;since it is final we cant change or update the respective variable
		System.out.println(i+20);
	}

}
