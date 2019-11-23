package com.objectclass;

public class B1 extends A1 {
	String s;
	char ch;
	B1(){}
	B1(int i,double j,String s,char ch)
	{
		super(i,j);
		this.s=s;
		this.ch=ch;
	}
	public boolean equals(Object ob)
	{
		B1 temp=(B1)ob;
		return super.equals(ob) && this.s==temp.s && this.ch==temp.ch;
	}
	public int hashCode() {
		int hs=s.hashCode()+ch;
		return hs;
	}

}
