package com.a21032023;


class P//class

{
	
  void p()//method
  
  {
	  
	  System.out.println("P executed");
  }


}

class Q extends P

{
	
	  void q()//method
	  
	  {
		  
		  System.out.println("Q executed");
	  }


	}

class R extends Q

{
	
	  void r()//method
	  
	  {
		  
		  System.out.println("R executed");
	  }


}

class S extends R

{
	
	  void s()//method
	  
	  {
		  
		  System.out.println("S executed");
	  }


}

public class MultilevelEx {
	
	public static void main(String[] args) 
		
	
	
	{
		S s = new S();//object
		
		s.p();
		s.q();
		s.r();
		s.s();
		
		
	}

}
