package AssignmentModule3;

/*Write a Java Program to Print pattern Given Below.
     1
    2 2 
   3 3 3
  4 4 4 4
 */

public class Program07c {
	
	public static void main(String[] args) {
		
		
		int count=1;
		
		for(int i=1;i<=4;i++)
			
		{		
			for (int j=4;j>=i;j--) {
			
				System.out.print(" ");	
			   			
		}
		
		
			for (int k=1;k<=i;k++)
			
				System.out.print(i+" ");
			    System.out.println();
			    
		}
			   			
	}
}


