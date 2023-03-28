package com.a18032023;

//Write a Program to check the given year is leap year or not.

import java.util.Scanner;

public class Assignment7 

{
    public static void main(String[] args) {
		
   	Scanner sc = new Scanner(System.in);
   	
   	System.out.println("Enter Your Year");
   	int year = sc.nextInt();
   	
   	if(year%4==0)
		{
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("Non leap year");
			
		}
   	 
   	 
	}
}
