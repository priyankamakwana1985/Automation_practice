package com.a30032023;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileIo 

{
	public static void main(String[] args) {
		
	String s="Welcome to Tops";
	
	try 
	{
		FileOutputStream fout = new FileOutputStream("D://Priyanka.txt");
		fout.write(s.getBytes());
	} 
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("File Creation Error");
	}
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Input Output Not Found");
	}
/*	catch(Exception e)
	{
		e.printStackTrace();
	}
	*/
	
	System.out.println("Executed");
}

}
