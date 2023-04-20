package AssignmentModule3;

//Write a Java Program to demonstrate multiple catch blocks

public class Program16 {

	public static void main(String[] args) 
	
	{
		
		try{
			System.out.println("start of try block");
			int num = 6/0;
			}
			catch(ArithmeticException e)
			{
			System.out.println("divide by zero exception ");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			}
			catch(Exception e)
			{
			System.out.println("Any other exception");
			}
			System.out.println("end of try-catch block");
			}
			
	}


