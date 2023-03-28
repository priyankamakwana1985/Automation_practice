package com.a16032023;

import java.util.Scanner;

public class UserDefinedValueEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your First Name");
		String fname = sc.next();
			
		System.out.println("Enter Your Last Name");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		
		//System.out.println(fname+"\t"+lname+"\t"+email+"\t"+pass);
		
		System.out.println("Your First Name is:"+fname+"\n"+"Your Last Name is:"+lname+"\n"+"Your Email is:"+email+"\n"+"Your Password is:"+pass);		
		
	}

}
