package Lab4q2;
import java.util.ArrayList;
import java.util.List;

public class Launcher 
{

	public static void main(String[] args) 
 {
// 创建一个实现多态性概念的程序。在程序中，创建一个ArrayList，它可以添加所有创建的对象，
//并通过调用object calArea（）方法 使用loop显示列表中的所有元素。
      List list=new ArrayList();
      
    two sq1=new square();list.add(sq1);
      square q1 = (square)sq1;q1.length2=2;
    
    three bigbox1 = new sphere();list.add(bigbox1);
      sphere cc1=(sphere)bigbox1;cc1.length3=3.0;
      
   System.out.println("Polymorphism way to show 2 dimensional Area(which is named as sq1): "+sq1.calArea());
   System.out.println("Polymorphism way to show 3 dimensional Volume(which is named as bigbox): "+bigbox1.calVolume());
      
    triangle tripod = new triangle();list.add(tripod);
      tripod.a2=3;tripod.h2=10;
    
    cube ball = new cube();list.add(ball);
      ball.r3=5;
      
   System.out.println("normal way to show 2 demensional Area(which is named as tripod): "+tripod.calArea());
   System.out.println("normal way to show 3 demensional Volume(which is named as ball): "+ball.calVolume());
 
   for (int i = 0 ; i<list.size();i++) 
   {
	if (i==0) 
	{System.out.print("Now Print all objects in Arraylist:\n");System.out.println(list.get(i));continue;}
	System.out.println(list.get(i));
   }
   
   
 }

}
