package com.arrayListProgram;

public class Employee {
	int id;
	String name;
	Employee(){}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return "["+id+","+name+"]";
	}
	

}
