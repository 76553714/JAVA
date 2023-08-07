package lab;
import java.util.Scanner;
import java.lang.Math;//高等数学
/* AuthorName:Yang YuKun
   Lab10q1  
   MaticNumber:209796
*/
public class Lab10q1_1
{
public static void main(String[] args)     {

	double side1;
	double side2;
	double side3;
  Scanner inputposition = new Scanner(System.in);  
  System.out.print("Input the position of x1");
  double x1 = inputposition.nextDouble();
  System.out.print("Input the position of y1");
  double y1 = inputposition.nextDouble();
  
  System.out.print("Input the position of x2");
  double x2 = inputposition.nextDouble();
  System.out.print("Input the position of y2");
  double y2 = inputposition.nextDouble();
  
  System.out.print("Input the position of x3");
  double x3 = inputposition.nextDouble();
  System.out.print("Input the position of y3");
  double y3 = inputposition.nextDouble();
  inputposition.close();
  
  side1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
  side2 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
  side3 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3, 2));
  if (isValid(side1,side2,side3)==true)
  {
  double area = area(side1,side2,side3);
  System.out.printf("The area is %.2f ",area);
  }
  else System.out.printf("Invalid triangle,not correct");
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