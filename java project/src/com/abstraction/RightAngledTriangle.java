package com.abstraction;

 class RightAngledTriangle extends Shape {
	 int base;
	 int height;
	 RightAngledTriangle(){}
	 RightAngledTriangle(int base,int height)
	 {
		 this.base=base;
		 this.height=height;
	 }
	 double area() {
		 return(0.5*base*height);
	 }
}
