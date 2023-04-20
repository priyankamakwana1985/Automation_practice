package AssignmentModule3;

import java.util.Scanner;

//Write a Java Program to Take three numbers from the user and print the greatest number


public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
				
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		       if (a > b && a > c)
			  				   
			  System.out.println("The greatest number is: " + a);
			   
			   else if (b > c)
			   
				  
			  System.out.println("The greatest number is: " + b);
			   
			   else
				  
			  System.out.println("The greatest number is : "+ c);
		
			
	}

}
