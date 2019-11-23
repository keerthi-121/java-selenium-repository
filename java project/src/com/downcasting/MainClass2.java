package com.downcasting;

public class MainClass2 {
	
	public static void main(String[] args)
	{
	A ob1=new A(10);
	display(ob1);
	A ob2=new B(20,30);
	display(ob2);
	A ob3=new C1(35,40);
	display(ob3);
	B ob4=new B(40,50);
	display(ob4);

}
static void display(A ob)
{
	System.out.println(ob.i);
	if(ob instanceof B)
		System.out.println(((B) ob).j);
	if(ob instanceof C)
		System.out.println(((C) ob).k);
}
}
