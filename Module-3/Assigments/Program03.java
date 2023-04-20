package AssignmentModule3;


//Write a Java Program to find factorial for Given Number.

//5! = 1*2*3*4*5


public class Program03 

{

	public static void main(String[] args) {
		
		     int num =5;
		     int fact=1;
		     
		     for(int i=1;i<=num;i++) {
		    	 
		    	 
		    	 fact = fact * i;
		    	 
		    	 System.out.println("current value" + " = " + fact);
		    	 
		     }
		     
		     //Print statement 
		     System.out.println("Factorial for Given Number =" + " "+ fact);
		
	}
	
		
}
	
	

