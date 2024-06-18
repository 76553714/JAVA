package lab;
import java.util.Scanner;
public class Lab4Q1 {

	public static void main(String[] args) {
		Scanner inputprice = new Scanner(System.in);
		
System.out.println("Enter the price");
double price = inputprice.nextInt();

        if (price<0)  {System.out.print("Price must be positive");}
                else if (price<150){price = price*0.95;System.out.println("the final price(5% discount) is: "+ price);}
                else if(price>= 150 && price< 600){price = price * 0.9;System.out.println("the final price(10% discount) is: "+price);}
                else if(price>=600){price = price * 0.85;System.out.println("the final price(15% discount) is: "+price);}
	}

}
