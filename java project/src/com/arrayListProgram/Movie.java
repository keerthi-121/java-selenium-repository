package com.arrayListProgram;

public class Movie {
	String name;
	double rating;
	Movie(){}
	public Movie(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + "]";
	}
	
	

}
