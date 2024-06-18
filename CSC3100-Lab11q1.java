package lab;
import java.util.Scanner;
import java.lang.Math;//

public class Lab11q1
{
public static void main(String[] args)
{
	int [] identification= {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
	int[] hour = new int[7];
	double[] payrate = new double[7];
	double[] salary = new double [7];
	Scanner input = new Scanner(System.in);
	for (int i = 0;i<7;i++) 
	{
		System.out.print("\n Input the pay rate of employee"+(i+1) );	
		payrate[i]=input.nextDouble();
		System.out.print("Input the working time of employee"+(i+1)+"(hours)" );	
		hour[i]=input.nextInt();
		if (hour[i]<0||payrate[i]<6) {System.out.print("ERROR!The working time can NOT be negative and the payrare must more than 6.00");System.exit(0);}
		salary[i]=calcsalary(payrate[i],hour[i]);
		System.out.print("The salary of Employee"+(i+1)+" (IdentificationNumber:"+identification[i]+")  is "+ salary[i]);
	}
	System.out.print("\n END");
input.close();
System.exit(0);

}//main
public static double calcsalary (double payrate,int hours)
              {
	
	            double salary = payrate*hours;
			    return (salary);
			  }

}//class
