package lab;
import java.util.Scanner;
public class Lab3Q2 {

	public static void main(String[] args) {
		Scanner shuru = new Scanner(System.in);
		
System.out.println("Enter the base value ");
int changdu = shuru.nextInt();

System.out.println("Enter the height value");
int gaodu = shuru.nextInt();

int mianji = gaodu * changdu /2 ;

System.out.println("The area of this triangle is "+ mianji +"cm²");
System.out.println("Enter the length value");
int kuandu = shuru.nextInt();

int tiji = mianji*kuandu;
System.out.println("The volume of this triangle is " +tiji+ "cm³");
		
	}

}
