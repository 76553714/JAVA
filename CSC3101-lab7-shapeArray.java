package lab7;
import java.util.ArrayList;
import java.util.Iterator;
public class shapeArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Now Start");	
	try {//If some error happened,Please contact Joy to solve
		Shape sp1 =new Shape("Green");
		 Circle cc2 =new Circle("Red",2.485);
		Shape cc3 =new Circle("White",4);
		 Circle cc4 =new Circle("pink",2);
		 Circle cc5 =new resizableCircle(80);	  

		 Triangle tr1 = new Triangle("Black",2,2,2);
		 Triangle tr2 = new Triangle("Pink",3,4,5);
		Shape tr3 = new Triangle("Blue",4,4,3);
		 Triangle tr4 = new Triangle("Yellow",6,8,10);
		 Triangle tr5 = new Triangle("Red",5,5,6);
	 
		 ArrayList shapes=new ArrayList();
		 shapes.add(sp1);shapes.add(cc2);shapes.add(cc3);shapes.add(cc4);shapes.add(cc5);
		 shapes.add(tr1);shapes.add(tr2);shapes.add(tr5);shapes.add(tr3);shapes.add(tr4);
		 Iterator it=shapes.iterator();
		 
		 while(it.hasNext()) 
		 {System.out.println(it.next());}
		 System.out.println("µü´ú½áÊøÁË");
		 for(int i =0;i<shapes.size();i++) 
		 {System.out.print("\n"+shapes.get(i));
			 System.out.print("Area: ");

			 System.out.print(((Shape)shapes.get(i)).getArea());
			 
			 System.out.print("     Perimeter: ");
			 System.out.print(((Shape)shapes.get(i)).getPerimeter());
			 
			 System.out.print("     Color: ");
			 System.out.print(((Shape)shapes.get(i)).getColor());
		 }	
	}catch(java.lang.ArrayIndexOutOfBoundsException e) {System.out.print("Warning! This is a BoundsException,But YANG YUKUN had expected this to happen,the Error information r as follows: ");e.printStackTrace();}
	catch(java.lang.IllegalArgumentException e) {System.out.println("Warning!This is a IllegalArgumentException,But YANG YUKUN had expected this to happen,if happened so,means some value is larger than 255!");e.printStackTrace();}
	catch(Exception e) {System.out.println("Error exists!But don't worry because YANG YUKUN had expected this to happen.The error information r as follows:");e.printStackTrace();}
	finally{System.out.print("\n END NOW");}
	}
}
