package com.a18032023;

//Write a Program to check the given number is Positive, Negative.

import java.util.Scanner;

public class Assignment6 

{
         public static void main(String[] args) {
			
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.println("Enter Your Number");
        	int number = sc.nextInt();
        	
        	if(number>=0)
			{
				System.out.println("Positive");
			}
			else if(number<0)
			{
				System.out.println("Negative");
				
			}
        	
        	 
		}
}
