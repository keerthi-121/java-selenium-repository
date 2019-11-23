package com.overriding;

public class B extends A{
	void test()
	/*method over riding happened here since we hav two methods with same name 
	execution starts from super class where all super class members gets memory there method of 
	super class also gets memory then while sub class members gets memory the method with same name is
	over ridden by child class method. so parent class method gets destroyed.*/
	{
		System.out.println("from test1()");
	}
}
