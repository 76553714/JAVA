package lab;
import java.util.Scanner;
import java.io.*;
public class Lab9q3
{	 
	public static void main(String[] args) throws Exception 
  {
	System.out.print("Please input the package number 1 or 2 (If you want to exit Please input other numbers)");
	Scanner input= new Scanner(System.in);
	int packagenumber=0;
	packagenumber=input.nextInt();
	
	if (packagenumber==1||packagenumber==2) {
	
		System.out.print("Success to input package number ");	
		System.out.print(packagenumber);
		readTypeAcct(packagenumber);
		
	                                       }
	
	else {
		System.out.print("Now exit");
		System.exit(0);
		 }
	
	
	System.out.print("Please input the call time");
	int calltime=0;
	calltime=input.nextInt();
	readCallTime(calltime);
	double fee=0;
	fee=calculateBill(calltime, packagenumber);
	printBill(calltime,packagenumber,fee);
	
	
}
	
	public static int readCallTime(int CALLTIME) {		
	 
	      return CALLTIME;	}
	
	public static int readTypeAcct(int number) {
		
    return number;}
	
	public static double calculateBill(int calltime, int packageType)     {
	  double fee=0;
 	  if (packageType==1) {
		  
		    if (calltime<=1000) {        fee=50.00;	                }
		    
		    if (calltime>1000) {fee= 1000*0.18+(calltime-1000)*0.35;}
		    	
	                      }
	
	   if (packageType==2) {
		//RM0.18 per minute is charged for the usage less than or equal to 1000 minutes. Any additional usage is charged at RM0.55 per minute.
		        if (calltime<=1000)
		        	fee=calltime *0.18;
		        if(calltime>1000)
		        	fee= 1000*0.18+(calltime-1000)*0.55;
	                    }
                                                return fee;                }
	
	public static void printBill(int calltime, int packageType, double amountDue) {
	  System.out.print("calltime: "+calltime+"packagetype: "+packageType+"Fee: "+amountDue);
                                                                            }

}

