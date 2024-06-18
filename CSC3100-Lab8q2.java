package lab;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab8q2
{

	public static void main(String[] args) throws Exception
	{
		
		File babyinfo = new java.io.File("E:\\javatest\\babyinfo.txt");	
		PrintWriter output  = new PrintWriter(babyinfo);
		
		
		int i = 0;
		while(i<3) {
		int year = 0;
		double weight = 0;
		String name = "";
		String gender ="";
		Scanner input =new Scanner(System.in);
		
	System.out.print("Please input the year");
		year=input.nextInt();
		output.println("\nYear "+ year);
	System.out.print("Please input the gender(F or M)");
	   gender = input.next();
	   output.println("Gender: "+gender);
	System.out.print("Please input the weight");
	weight = input.nextDouble();
	output.println("Weight: "+weight);
	System.out.print("Please input the name");
	name = input.next();
	output.println("Name: "+name);

	
	
	 
	 
	 
	 
	 i++;
	       }//while
		output.close();
		System.out.println("Finished");
	}

}


