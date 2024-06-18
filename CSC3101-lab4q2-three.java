package Lab4q2;
//而三维形状有两个子类：立方体和球体，分别有calArea（）和calVolume（）方法来计算表面积和体积。
public class three 
{
 public double calArea  () {return 0;}
 public double calVolume() {return 0;}
}

class cube extends three
{	public double r3;
  public double calArea  () {return 4*3.1415926*r3*r3;}
  public double calVolume() {return 4/3*3.1415926*r3*r3*r3;}
}

class sphere extends three
{	
  public double length3;
  public double calArea  () {return 6*length3*length3;}
  public double calVolume() {return length3*length3*length3;}
}