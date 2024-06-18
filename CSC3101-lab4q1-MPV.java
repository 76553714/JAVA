package Lab4q1;

public class MPV extends Car
{
	private int length;
	public void setlength(int length) {this.length=length;}
	
	public double SalePrice() 
	{
		if (this.length>15)
			return (0.975*Double.parseDouble(this.getregularPrice()));
		else return(0.95*Double.parseDouble(this.getregularPrice()));
	}//If length >15 feet, 2.5% discount, otherwise, 5% discount
	
	public void show() 
	 {
	   System.out.println("\n Now show the all information of this MPV");
	   System.out.println("\n Length: "+this.length+"\n Speed: "+this.getspeed()+"\n regularPrice: "+this.getregularPrice()+"\n Color: "+this.getcolor());
	 }
}
