package com.a30032023;

public class TryCatchEx 

{
	public static void main(String[] args) 
	
	{
	
	//Try-Catch-Exception Handling Keywords
	
   //Logic Portion Conduct
	
	
	try
	{
		int data = 10/0;
		
		System.out.println(data);
	}

	//if error is there in logical part then it will be catch in catch block
	
	catch(Exception e)
	
	{
		
		System.out.println(e);
	}
	
	       //finally blocks code will execute compulsory
	
			finally 
			{
				System.out.println("Executed");
			}
	}
}
