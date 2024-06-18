package lab2;
import java.util.Scanner;

public class Question2 {
                        public static void main(String[] args) {
        Scanner shuru= new Scanner(System.in);
       
     System.out.print("Please input the Price");
     long jiage = shuru.nextLong();
        
     System.out.println("Please input the Tax Rate");
     float TaxRate = shuru.nextFloat();
		
	 double TotalMoney = jiage + jiage * TaxRate;
	  
     System.out.println("Price: "+jiage);
     System.out.println("Taxrate: "+TaxRate);
     System.out.println("Total Sale: "+TotalMoney);
	                                        }

}
