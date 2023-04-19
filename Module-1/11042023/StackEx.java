package com.a11042023;

import java.util.Stack;

//push,pop-Entry,Exit

public class StackEx 
{
			static void push(Stack st ,Integer i)
		{
			st.push(i);
			System.out.println(i);
			System.out.println(st);
			
		}
		static void pop(Stack st)
		{
			Integer i = (Integer) st.pop();
			System.out.println(i);
			System.out.println(st);
			
		}
		
		public static void main(String[] args) 
		{
			
			Stack st =new Stack<>();
			
			push(st, 10);
			push(st, 20);
			push(st, 30);
			push(st, 40);
			
			try
			{
				pop(st);
				pop(st);
				pop(st);
				pop(st);
				pop(st);
				
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		
			
					
		}
	
}
