package com.a06042023;

import java.util.Scanner;

public class Encap 
{
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your City");
		String city= sc.next();
		
		Model m = new Model();
		
		m.setName(name);
		m.setCity(city);
		
		System.out.println(m.getName()+" from  "+m.getClass());
		
	}

}
