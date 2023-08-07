package Lab4q1;

public class Sedan extends Car
{
	private int year;
	private int manufacturerDiscount;
	
	public void setmanufactureDiscount(int dsct) 
	{this.manufacturerDiscount=dsct;}
	
	public void setyear(int year)
	{this.year=year;}
	
	public double SalePrice() 
	{
		return (Double.parseDouble(this.getregularPrice())-manufacturerDiscount);
	}//From the sale price computed from Car class, subtract the manufacturerDiscount.
	
	public void show() 
	 {
	   System.out.println("\n Now show the all information of this Sedan");
	   System.out.println("\n year: "+this.year+"\n Speed: "+this.getspeed()+"\n regularPrice: "+this.getregularPrice()+"\n Color: "+this.getcolor());
	 }
	
}
