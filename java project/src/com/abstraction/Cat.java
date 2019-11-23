package com.abstraction;

public class Cat extends Animal {
	Cat(){}
	Cat(double height,double weight)
	{
		super(height,weight);
	}
	void talk()
	{
		System.out.println("Cat meow");
	}

}
