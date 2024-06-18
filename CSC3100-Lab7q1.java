package lab;

import java.util.Scanner;
public class Lab7q1
{

	public static void main(String[] args) 
	{
	double money = 0;
	double yield =0;
	double month = 0 ; 
	double finalmoney=0;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please input the money");
	money=input.nextDouble();
	System.out.println("Please input the rate of yield");
	yield= input.nextDouble();
	System.out.println("Please input the time(month)");
	month=input.nextDouble();
	
if (month>0&&yield>0&&money>0)
{	

    finalmoney=money;
    System.out.print("Month CD value");
	for(int c = 1;c<=month;c++) 
	{
		finalmoney =finalmoney+ finalmoney*yield/1200;
		System.out.print("\n"+c+"  ");
	System.out.printf("%.2f",finalmoney);
	}
	
}	
else {System.out.print("Invalid Inputing!"+"Must be positive!");}	
	
}

}


