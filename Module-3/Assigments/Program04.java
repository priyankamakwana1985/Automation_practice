package AssignmentModule3;


//Write a Java Program to check given Number is prime or not

//Prime Number - A number that is divisible only by 1 and itself

//Example - 2,3,5,7,11,13


public class Program04 {



    public static void main(String[] args) {
		
    	int num = 7;
    	int count=0;
    	
    	for(int i=1;i<=num;i++) {
    		
    		if(num % i==0) {
    			
    			count++;
    		}
    	}
    	
    	if(count==2) {
    	
    	     System.out.println(num + " " + "is a Prime Number");
    	
    	}else 
    	
    	{
    	  System.out.println(num + " "+ "is not a Prime Number");
    	
    	}
    }
   



}