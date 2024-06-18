package lab1;
import java.util.Scanner;//LAB1 Q3 ||
public class Fan 
{
  final static int FAST=    3;
  final static int MEDIUM = 2;
  final static int SLOW =   1;
  
   int speed = SLOW;
    boolean on = false;double radius = 5;String color = "blue";
   
    static Fan storage[]=new Fan[2];
    
    public Fan() {this.speed=speed;this.on=on;this.radius=radius;this.color=color;}
    
	 public static void main(String[] args) 
	    { Fan fan1 = new Fan();Fan fan2 = new Fan();
		  fan1.speed=FAST;fan1.color="yellow";fan1.radius=10;
		  fan2.speed=MEDIUM;fan2.color="blue"; fan2.radius=5;
		   Fan [] fans = new Fan[2];
		    fans[0]=fan1;
		    fans[1]=fan2;
		  System.out.println(fan1.toString());
		  System.out.println(fan2.toString());
		  
		  fan1.mutator();
		  accessor(fans);
		  
    	}
	 //accessor and mutator methods
	 public String toString() 
	     {
		 if (this.on==true)
			 return ("Speed: "+this.speed+" Color: "+this.color + " Radius: "+this.radius);
				 else return (this.color +" "+this.radius+" fan is off");                
		 }
	 
	 public static void accessor(Fan[] fans)
      { 
	  storage =fans.clone();//
	  System.out.println("storage test output:"+storage[0].on);//test output
	  System.out.println("storage test output:"+storage[1].color);//test output
	  System.out.print("stored Successfully");
	  }

	 public void mutator() 
   {
   Scanner input = new Scanner(System.in);
   System.out.print("input the new speed that you want to update");
   int newspeed = input.nextInt(); 
    if (newspeed<4&&newspeed>0)
	   this.speed=newspeed;
    else {System.out.print("Invalid Speed!The Highest Speed is 3,Exited.");System.exit(0);}
   System.out.print("input the new color you want to update");
   this.color=input.next();
   System.out.print("input the new radius that you want to update");
   this.radius=input.nextInt();
   System.out.print("input the new onoff status that you want to modify(false or true)");
   this.on=input.hasNextBoolean(); 
   }
}//FAN


