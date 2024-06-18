package lab;
import java.util.Scanner;
import java.lang.Math;//advanced math

public class Lab10q1
{
public static void main(String[] args)     {
  Scanner inputSide = new Scanner(System.in);
		
 System.out.println("Please Input the side1");	
  double side1 = inputSide.nextDouble();
   if (side1<=0) {System.out.print("Side1 can NOT be negative,Programm has Exited ");System.exit(0);}
 System.out.println("Then Input the side2");	
  double side2 = inputSide.nextDouble();
   if (side2<=0) {System.out.print("Side2 can NOT be negative,Programm has Exited");System.exit(0);}
 System.out.println("Finally Please Input the side3");	
  double side3 = inputSide.nextDouble();
    if (side3<=0) {System.out.print("Side3 can NOT be negative,Programm has Exited");System.exit(0);}
 inputSide.close();  
  boolean trueorfalse=isValid(side1,side2,side3);
  System.out.println(" This is a "+trueorfalse+" triangle");
   if (trueorfalse == true)  {double area = area(side1,side2,side3);System.out.print("area is "+ area );}

                                                }//main
	
 public static boolean isValid(double side1,double side2, double side3) 
    {
	 boolean isValid = true;
    if(side1+side2>side3&&side2+side3>side1&&side1+side3>side2)
	 isValid = true;
    else 
	 isValid = false;
    
    return isValid;
    
    }

 public static double area(double side1,double side2,double side3) 
    { 
    	double s = (side1+side2+side3)/2;
    	double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    	return area;
    }

}
