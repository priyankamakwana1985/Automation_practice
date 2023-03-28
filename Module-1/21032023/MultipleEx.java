package com.a21032023;

interface X

{
	void x1();

}

interface Y

{
	
  void y1();

}
 
class Z implements X,Y

{
	
  public void y1() {
	  
	  System.out.println("Y1 Executed");
  }

  public void x1() {
	  
	  System.out.println("X1 Executed");
  }
  
}

public class MultipleEx {
	
	public static void main(String[] args) {
		
		Z z = new Z();
		
		z.x1();
		z.y1();
	}

}
