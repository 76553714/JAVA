package Lab4q1;
import java.util.*;

public class CarLauncher extends Car{

	public static void main(String[] args)
	{
		System.out.print("successfully to run \n");
		
	  Car caravan1=new Caravan();caravan1.setcolor("Blue");caravan1.setregularPrice("4900");caravan1.setspeed(120);
	  Caravan c1 = (Caravan)caravan1;c1.setweight(50);
	  
      Car mpv1    = new MPV();mpv1.setcolor("Blue");mpv1.setregularPrice("3090");mpv1.setspeed(100);
      MPV M1=(MPV)mpv1;M1.setlength(14);
      
      Car sedan1=new Sedan();

  
     List list = new ArrayList();
      list.add(caravan1);list.add(mpv1);list.add(sedan1);
      System.out.print(list);//OUTPUT the arraylist which store the object(Car type)
      
      Discount test = new Discount();
  //if press F11 to debug,it will stop at here,but if normally press green button to run, it will not stop at here and run normally,idk y
      
    c1.show();
    //use normal way to show all information to identify the car
       System.out.print("\n test car 1 after discount : "+test.getDiscount(caravan1));
       //use polymorphically invoking way to show the price after discount
      
    M1.show();
          
       System.out.print("\n test car 2 after discount : "+test.getDiscount(mpv1));
      
      
      System.out.print("\n successfully done");
      
	}
	
  
  
}
