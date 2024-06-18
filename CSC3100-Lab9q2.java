package lab;
import java.util.Scanner;
import java.util.Scanner;
public class Lab9q2
{

	public static void main(String[] args) throws Exception
	{
	 double Celsiusin1=40.0;
	 double Fahrenheit_out1=0;
	 double Fahrenheit_in1=120;
	 double Celsius_out1=0;
	 
	
	 Fahrenheit_out1=celsiusToFahrenheit(Celsiusin1);
	 Celsius_out1 =fahrenheitToCelsius(Fahrenheit_in1);
	 
		System.out.print("Celsius Fahrenheit Fahrenheit Celsius\n");
		
		System.out.printf("%.2f    ",Celsiusin1);
		System.out.printf("%.2f    ",Fahrenheit_out1);
		System.out.printf("%.2f    ",Fahrenheit_in1);
		System.out.printf("%.2f    ",Celsius_out1);
}
	public static double celsiusToFahrenheit(double Celsius)throws Exception		
	{
		double fahrenheit=0;
		fahrenheit = (9.0 / 5) * Celsius + 32;
		return fahrenheit;                                                      	
	}
      
	public static double fahrenheitToCelsius(double Fahrenheit)throws Exception
	{
    double celsius =0;
	celsius = (Fahrenheit -32)/(9.0 / 5);
	return celsius;
    }

}


