package com.abstraction;

public class Jungle {

	public static void main(String[] args) {
		Animal a;
		a=new Dog(12,35);
		a.talk();
		System.out.println(a.height+" "+a.weight);
		a=new Lion(34,200);
		a.talk();
		System.out.println(a.height+" "+a.weight);
		a=new Cat(10,32.3);
		a.talk();
		System.out.println(a.height+" "+a.weight);
		

	}

}
