package com.objectclass;

public class Demo1 {
	int i;
	double d;
	Demo1(){}
	Demo1(int i,double d)
	{
		this.i=i;
		this.d=d;
		
	}
	public boolean equals(Object ob)
	{
		Demo1 temp=(Demo1)ob;
		return this.i==temp.i && this.d==temp.d;
	}
	

}
