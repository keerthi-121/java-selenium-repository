package com.objectclass;

public class Company {
	public static void main(String[] args) {
		Emp e=new Emp(1,"vishnu",10);
		System.out.println(e);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		Emp[] e1={ new Emp(2,"mahesh",12),e};
		System.out.println(e1[0]);
		System.out.println(e1[1]);
		
		
	}

}
