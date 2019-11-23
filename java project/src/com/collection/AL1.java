package com.collection;

import java.util.ArrayList;

public class AL1 {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	al.add(10);
	al.add(20);
	al.add("teja");
	System.out.println(al);
	al.add(1,"sudarshan");
	System.out.println(al);
	al.add("hithesh");
	al.add("aaditya");
	System.out.println(al.isEmpty());
	System.out.println(al.size());
    
	System.out.println(al.set(5,"harshith"));
	System.out.println(al);
	System.out.println(al.contains("asmitha"));
	System.out.println(al.add(20));
	System.out.println(al);
	System.out.println(al.indexOf(20));
	System.out.println(al.lastIndexOf(20));
	System.out.println(al.indexOf("theja"));
	System.out.println(al.size());
	System.out.println(al);
	al.clear();
	System.out.println(al.isEmpty());
	System.out.println(al.size());
}
}
