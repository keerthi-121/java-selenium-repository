package com.polymorphism;

public class MainClass2 {

	public static void main(String[] args) {
		Bank bank;
		bank=new Icici();
		bank.roi();
		System.out.println(bank.roi());
		bank=new SBI();
		bank.roi();
		System.out.println(bank.roi());
		bank=new SbiInTouch();
		bank.roi();
		System.out.println(bank.roi());
		bank=new Canara();
		bank.roi();
		System.out.println(bank.roi());

	}

}
