package com.a21032023;

class Mycolor

{
	String color = "black";
		
}

class Mycolor2 extends Mycolor

{
	String color = "white";
	
	void print()
	
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
}

 public class SuperEx
 
 {
	 
	 public static void main(String[] args) {
		
		 Mycolor2 m = new Mycolor2();
		 
		 m.print();
	}
	 
 }