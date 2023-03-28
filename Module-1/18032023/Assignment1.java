package com.a18032023;

import java.util.Scanner;

public class Assignment1 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		
		System.out.println("Enter Your Birth date");
		String bdate = sc.next();
		
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		
		System.out.println("Enter Your Address");
		String add = sc.next();
		
		System.out.println("Your Name:"+name+"\n"+"Your Birth date:"+bdate+"\n"+"Your Age:"+age+"\n"+"Your Address:"+add);
		
		
	}
}
