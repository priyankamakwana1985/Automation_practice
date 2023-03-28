package com.a18032023;

public class StudentEx {
	
	
	
	int id;
	String name;
	
	public static void main(String[] args) {
		
		//classname objname = new classname();
		
		StudentEx s1 = new StudentEx();
		StudentEx s2 = new StudentEx();
		
		//Assign the value in Object 
		
		s1.id=101;
		s1.name="Priyanka";
		
		s2.id=102;
		s2.name="Pramit";
				
		//Print value from object
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}

}
