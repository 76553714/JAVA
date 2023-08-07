package lab;
import java.util.Scanner;
import java.io.*;
public class Exercise3
{	public static void main(String[] args) throws Exception 
  {
	Scanner inputnumber =new Scanner(System.in);
	double number1;
	double number2;
	double number3;
	number1 = inputnumber.nextInt();
	number2 = inputnumber.nextInt();
	number3 = inputnumber.nextInt();  
     inputnumber.close();
  double SUM= SUM(number1,number2,number3);
	System.out.print(SUM);
}



public static double SUM(double number1,double number2,double number3){
double SUM = number1+number2+number3;
return SUM;

}




}
