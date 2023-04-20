package AssignmentModule3;

import java.util.Scanner;

//Write a Java Program to check given Number is Armstrong or not

//Armstrong Number is a number that is equal to the sum of cubes of its digits

//Example
//Input1 - 153 , (1*1*1)+(5*5*5)+(3*3*3)= 1+125+27 = 153       Outpu1 = Armstrong Number
//Input2 - 123 , (1*1*1)+(2*2*2)+(3*3*3)= 1+8+27 = 36          Outpu1 = Not an Armstrong Number

public class Program05 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int temp = num;
        int sum = 0;
        
        while(num>0) 
        
        {
        	
        	sum = sum + (num%10)*(num%10)*(num%10);
            num = num/10; 
        	
        }
        
        if(sum==temp) {
            System.out.println(temp + " " + "is a Armstrong Number");
            
       }else {
       
       System.out.println(temp + " " + "is not an Armstrong Number");
       
       }
        
	}

}
     
       
        
