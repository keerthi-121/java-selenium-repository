package com.encapsulation;

public class EmployeePortal {
	public static void main(String[] args) {
		Employee emp=new Employee(1,"rahul",10.0);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.readSalary());
		emp.setSalary(100);
		System.out.println("employee salary "+readSalary);
	}

}
