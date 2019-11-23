package com.arrayListProgram;
import java.util.ArrayList;


public class HetroAl {
	public static void main(String[] args) {
		ArrayList hetro=new ArrayList();
		hetro.add(new Bike("red",60));
		hetro.add(new Employee(1,"vishnu"));
		hetro.add(new Movie("Bala",4.5));
		hetro.add('m');
		hetro.add(10);
		System.out.println(hetro);
		for(int i=0;i<hetro.size();i++)
		{
			Object x=hetro.get(i);
			if(x instanceOf Bike)
			{
				System.out.println(((Bike)x).color);
				System.out.println(((Bike)x).mileage);
			}
			if(x instanceOf Employee) 
			{
				System.out.println(((Employee)x).id);
				System.out.println(((Employee)x).name);
			}
		}
		
	}

}
