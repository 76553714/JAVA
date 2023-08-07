package lab7;
public class resizableCircle extends Circle implements resizable
{
	double radius;
	
	public resizableCircle() {}
	public resizableCircle(double radius) {}
	
	public double resize(int percent) {return percent/100*this.radius;}

}
