package com.a14032023;

import java.util.Scanner;

public class UserDefinedValueEx {


	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
		
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your marks");
		double marks = sc.nextDouble();
		
		if (marks>=35)
			
			System.out.println("Pass");
		
		else
		
		System.out.println("Fail");	
		
	}

}
