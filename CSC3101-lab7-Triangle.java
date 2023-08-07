package lab7;

public class Triangle extends Shape implements printObject
{
	private double base=0;private double height=0;private double width=0;
	
	public Triangle() {}
	public Triangle(String color,double base,double width,double height) 
	{
		this.color=color;
		this.width=width;
		this.height=height;
		this.base=base;
	}
	
	public boolean checkWidthHeight()
	{
		if (this.width>0&&this.height>0)
			return true;
	   else return false;
	}
	
	public double getArea() {return this.base*this.height/2;}
	
	public double getPerimeter() {return (this.height+this.base+this.width);}
	//Still can not caculate the third side and Perimeter only by this data;
	
	public void printArea(){System.out.println(this.getArea());}
	
	public void printPerimeter(){System.out.println(this.getPerimeter());}
	
}
