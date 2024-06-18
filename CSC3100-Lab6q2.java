package lab;

import java.util.Scanner;
public class Lab6q2 
{

	public static void main(String[] args) 
	{
		  
				long SUM=0;
				long number;
				long num=0;
			System.out.print("Please enter a POSITIVE integer");
			Scanner input = new Scanner(System.in);
			number = input.nextLong();
			
			if (number>0) 
			{
				
			 while(num<=number)
			 {
				
				SUM = SUM + num;
				num++;
				
				
			 }	
				
				
			}
			
			
			else {
				
				System.out.print("Invalid Number!");
			    System.exit(0);
			    
			     }
		
               System.out.print("the sum is"+SUM);
   }

	
		
}


