package AssignmentModule3;

//Write a Java Program to sum values of an array. 

import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) 
		
		{
	        int n, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of the array:");
	        n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter array elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = sc.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum of the array is:"+sum);
	    }
	
	

}
