package Lab4q2;
//�������ࣺԲ�������κ������Σ����������������calArea����������
public class two 
{
 public double calArea() {return 0;}
}

class square extends two
{	public double length2; 
  public double calArea() {return this.length2*this.length2;}
}

class triangle extends two
{	public double a2;public double h2;
  public double calArea() {return this.a2*this.h2;}
}

class circle extends two
{	public double r2;
  public double calArea() {return this.r2*3.1415926;}
}
