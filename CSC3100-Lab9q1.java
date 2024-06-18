package lab;
import java.util.Scanner;
import java.io.*;
public class Lab9q1
{	public static void main(String[] args) throws Exception 
  {
	double num1=0,num2=0,num3=0;
	
    num1=readInput(num1);
    num2=readInput(num2);
    num3=readInput(num3);
    double average = calcAverage(num1,num2,num3);
    printOutput (average);
  }//main

public static double readInput(double num)
 {
 System.out.print("Please input the number");
 Scanner input= new Scanner(System.in); 
 return num =  input.nextDouble();
 }//readInput


public static double calcAverage(double number1,double number2,double number3)
{
  double average =(number1+number2+number3)/3;  
  return average;
}

public static void printOutput (double average) 
{
	System.out.print("The average number is : "+average);

}

}//calss
