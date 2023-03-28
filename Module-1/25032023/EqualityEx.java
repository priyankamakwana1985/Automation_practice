package com.a25032023;

public class EqualityEx {
	
	public static void main(String[] args) 
	
	{
		
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = "Sachin";
		String s4 = "Priya";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
	}

}
