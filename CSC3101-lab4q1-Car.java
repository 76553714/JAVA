package Lab4q1;
import java.util.*;

 public class Car 
{
	 
	 private int speed;
	 private String regularPrice;
	 private String color;

	 public Car(){}
	 public Car(int speed,String regularprice,String color) {this.speed=speed;this.regularPrice=regularprice;this.color=color;}
	 
	 public void setspeed(int speed) {this.speed=speed;}
	 public void setregularPrice(String reprice) {this.regularPrice=reprice;}
	 public void setcolor(String color) {this.color=color;}

	 public int    getspeed() {return this.speed;}
	 public String getregularPrice() {return this.regularPrice;}
	 public String getcolor() {return this.color;}

	 public double SalePrice() {System.out.print("This is SalePrice method of Car ");return 0;}
	 public void show() {System.out.print("This is show method of Car");}
	 //public double salePrice() {return 0;}
}

