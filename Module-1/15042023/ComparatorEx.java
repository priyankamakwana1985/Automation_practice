package com.a15042023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Abc
{
	int id;
	String name;
	int age;
	
	public Abc(int id,String name,int age) 
	{
		
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator implements Comparator
{
	
	
	@Override
	public int compare(Object o1, Object o2) 
	{
		// TODO Auto-generated method stub
	
		Abc s1=(Abc)o1;  
		Abc s2=(Abc)o2;  
		
		if(s1.age==s2.age) 
		{
			return 0; 
			
		} 
		else if(s1.age>s2.age) 
		{
			return 1; 
		} 
		else 
		{
			 return -1; 
			 
		}
	}

}


class NameComparator implements Comparator

{  
public int compare(Object o1,Object o2)

{  
	Abc s1=(Abc)o1;  
	Abc s2=(Abc)o2;  
  
	return s1.name.compareTo(s2.name);  
}  
}  


public class ComparatorEx 
{
	public static void main(String[] args) {
		
		
		ArrayList<Abc> al=new ArrayList<Abc>();  
		al.add(new Abc(101,"Vijay",23));  
		al.add(new Abc(106,"Ajay",27));  
		al.add(new Abc(105,"Jai",21));  
		
		try
		{
			
			  System.out.println("Sorting by name");
			  
			  
			  Collections.sort(al,new NameComparator());
			  
			  //-1.---------------
			  Iterator<Abc> i = al.iterator(); while(i.hasNext())
			  { 
				  Abc st=i.next();
				  System.out.println(st.id+" "+st.name+" "+st.age); 
			  }
			 
			
			
			System.out.println("Sorting by age");
			
			
			//-2.---------------------------
			Collections.sort(al,new AgeComparator());
			
			
			
			Iterator<Abc> i2 = al.iterator();
			while(i2.hasNext())
			{
				Abc st2=i2.next();  
				System.out.println(st2.id+" "+st2.name+" "+st2.age);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
