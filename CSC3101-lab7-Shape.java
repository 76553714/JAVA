package lab7;

public class Shape 
{
	String color=" ";
	public Shape() {}
	public Shape(String color) {this.color=color;}
	
	public String getColor() {return this.color;}
	public void setColor(String color) {System.out.print("Color has been set to "+color);}
	
	public double getArea() 
	{
		System.out.println("Can not show area now,because it's just type of 'Shape',must be instance");
		return -1;
	}
	
	public double getPerimeter() 
	{
		System.out.print("Can not show area now,because it's just type of 'Shape',must be instance");
		return -1;
	}
	
	

}
