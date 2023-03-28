package com.a21032023;

 class Bank
 
 {
	 void bank()
	 
	 {
		 System.out.println("banking system");
		 
	 }
	 
	 
 }
 
 class Current extends Bank
 
 {
	 void current()
	 
	 {
		 System.out.println("current account");
		 
	 }
		 
 }
 
 class Saving extends Bank
 
 {
	 void saving()
	 
	 {
		 System.out.println("saving account");
		 
	 }
		 
 }

public class HierarchicalEx {

	public static void main(String[] args) 
	{
		Current c = new Current();
		Saving  s = new Saving();
		
		   c.current();
		   s.saving();
		   c.bank();
	}
}
