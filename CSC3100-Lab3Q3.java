package lab;
import java.util.Scanner;
public class Lab3Q3 {

	public static void main(String[] args) {
		Scanner shuru = new Scanner(System.in);
		
	System.out.println("Enter the driving distance:");
		int juli = shuru.nextInt();
		
		System.out.println("Enter miles per gallon:");
		 int mile = shuru.nextInt();
		
		 System.out.println("Enter price per gallon: ");
		 int danjia = shuru.nextInt();
		 int zongjia = juli / mile * danjia;
		 System.out.println("The cost of driving is "+zongjia+"");		
	}

}
