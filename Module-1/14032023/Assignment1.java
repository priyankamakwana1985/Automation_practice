package com.a14032023;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	    double Pie = 3.14;
	    
		System.out.println("Enter radius of Circle");
		int r = sc.nextInt();
		
		double area = Pie* r *r;
		
		System.out.println(area);
		
		
	}

}
