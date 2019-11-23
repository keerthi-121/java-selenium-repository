package com.objectclass;

public class Demo2 extends Demo1 {
	char ch;
	String s;
	Demo2(){}
	Demo2(int i,double d,char ch,String s)
	{
		super(i,d);
		this.ch=ch;
		this.s=s;
		
	}
	public boolean equals(Object ob)
	{
		Demo2 temp=(Demo2)ob;
		return super.equals(ob) && this.ch==temp.ch && this.s.equals(temp.s);
	}

}
