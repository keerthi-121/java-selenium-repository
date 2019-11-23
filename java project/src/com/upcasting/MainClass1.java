package com.upcasting;

public class MainClass1 {

	public static void main(String[] args) {
		A ob1=new B();//upcasting
		System.out.println(ob1.i);
		//System.out.println(ob1.j);cte:using parent type ref.var 
		//we cant access child type
		B ob2=new B();//another type of upcasting
		A ob3=ob2;
		System.out.println(ob3.i);
		//System.out.println(ob3.j);cte:using parent type ref.var 
		                           //we can't access child type
		
	}

}
