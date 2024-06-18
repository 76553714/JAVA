package lab2;
public class Food {
	  
  boolean valid;
   double total;
   double gram;
 public double SUM;
 public double percent;
 
 public Food( double total, double gram) {this.total=total;this.gram=gram;}
 public Food() {};//·½·¨µÄÖØÔØ
 
 public static void main(String[] args) 
	{   
	 
	  Food Crunchy =new Food(539.7,32.22);
	   Food Muruku = new Food(111.0,7.00);
	    Food  A =     new Food(211.0,7.00);
	     Food Iemak =  new Food(644.0,83.0);
	  
	    Crunchy.ifvalid();
	  	 System.out.println("Sum of calories and fat grams in Crunchy:"+Crunchy.calcSum()+"\n Percentage of calories from fat in Crunchy: "+Crunchy.calcpercent());
	  	Muruku.ifvalid();
	  	 System.out.println("Sum of calories and fat grams in Muruku:"+Muruku.calcSum()+"\n Percentage of calories from fat in Muruku: "+Muruku.calcpercent());
	  	A.ifvalid();
	  	 System.out.println("Sum of calories and fat grams in Food A:"+A.calcSum()+"\n Percentage of calories from fat in A:"+A.calcpercent());
	  	Iemak.ifvalid();
	  	 System.out.println("Sum of calories and fat grams in Iemak"+Iemak.calcSum()+"\n Percentage of calories from fat in Iemak "+Iemak.calcpercent());
	}
 
  public void ifvalid() 
  {
 	   if (this.gram<0||this.total<0)
 		  {System.out.println("Super Invalid!Data Must be positive!");this.valid=false;}
 	   else if (this.gram*9<0.3*this.total)
 		{System.out.println("This is low fat");this.valid=true;}
 	   else if (this.gram*9>this.total)
 		{System.out.println("Invalid!Invalid input");this.valid=false;}
 		else {System.out.println("This is normal food");this.valid=true;}
  }

  public double calcSum() //in:total gram ||out:SUM
  {
	 if (this.valid==false) {System.out.println("Can't caculate SUM because this is a invalid food,Please input again");return 0;}
	 else return (this.total+this.gram);
  } 

 public double calcpercent()
 
 {
	 if (this.valid==false) {System.out.println("Can't caculate percentage because this is a invalid food,Please input again");return 0;}
	 else return (this.gram*9/this.total)*100;
 }
}
