package lab2;
import java.util.Scanner;
public class question1 {
	public static void main (String[] args){
int num = 0;
int mul=0;

int a,b,c;
Scanner scanner = new Scanner(System.in);
 System.out.print("Please Enter integer between 0 to 1000");
 num = scanner.nextInt();
 a = num%10;
 b=(num/10)%10;
 c=(num/100)%10;
 mul = a*b*c;
 System.out.print("The multiplication of all digits in "+ num +" is "+mul);
}
}
