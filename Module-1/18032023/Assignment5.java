package com.a18032023;

//Write a program to calculate sum of 5 subjects & find the percentage.Subject marks entered by user.

import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Marks of Maths");
		int M = sc.nextInt();
		
		System.out.println("Enter Marks of Science");
		int S = sc.nextInt();
		
		System.out.println("Enter Marks of English");
		int E = sc.nextInt();
		
		System.out.println("Enter Marks of Hindi");
		int H = sc.nextInt();
		
		System.out.println("Enter Marks of Gujarati");
		int G = sc.nextInt();
		
		int sum = M+S+E+H+G;
		int per = (M+S+E+H+G)*100/500;
		
		System.out.println(sum);
		System.out.println(per);
		
	}

}
