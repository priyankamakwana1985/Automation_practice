package com.a16032023;

import java.util.Scanner;

public class SwitchEx {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		
		int number = sc.nextInt();
		
		switch(number)
		
		{
		  case 1: System.out.println("Your Selected Language is English");
		  break;
		  
		  case 2: System.out.println("Your Selected Language is Hindi");
		  break;
		  
		  case 3: System.out.println("Your Selected Language is Gujarati");
		  break;
		
		  case 4: System.out.println("Your Number is not Valid");
		  break;
		
		
		}
		
		
	}
			
	
	
}
