package com.a18032023;

import java.util.Scanner;

public class Assignment2 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a");
		int a = sc.nextInt();
		
		
		System.out.println("Enter Value of b");
		int b = sc.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		
		System.out.println("Addition:"+add+"\n"+"Substraction:"+sub+"\n"+"Multiplication:"+mul+"\n"+"Division:"+div);
		
		
	}
	

}
