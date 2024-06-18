package lab7;
public class Circle extends Shape implements printObject
{
	private double radius;
	public Circle() {}
	public Circle(String color,double radius) 
	  {this.color=color;this.radius=radius;}
	
	public void setradius(double radius) 
	{this.radius=radius;} 
	
	public boolean checkRadius() 
	{
		if(this.radius>0)
			return true;
		else return false;
	}
	
	public double getArea() {return (this.radius*this.radius*3.1415926);}
	
	public double getPerimeter() {return (this.radius*2*3.1415926);}

	public void printArea	  () {System.out.println(this.getArea());}
	public void printPerimeter() {System.out.println(this.getPerimeter());}
	
	public double test() {return 0;}
}
