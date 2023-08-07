package Lab4q1;

public class Caravan extends Car
{
  private int weight;
 

  public void setweight(int weight) {this.weight=weight;}
 public double SalePrice() 
 { if(this.weight>2500)
	 return ( Double.parseDouble(this.getregularPrice())*0.925 );
 else return( Double.parseDouble(this.getregularPrice())*0.9);
 }//If weight > 2500, 7.5% discount. Otherwise, 10% discount.
 public void show() 
 {
   System.out.println("\n Now show the all information of this Caravan");
   //int speed,String regularprice,String color and int weight
   System.out.println("\n weight: "+this.weight+"\n Speed: "+this.getspeed()+"\n regularPrice: "+this.getregularPrice()+"\n Color: "+this.getcolor());
 }
}
