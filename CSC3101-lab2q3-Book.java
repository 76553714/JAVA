package lab2q3;

public class Book extends Identification{
	
	String name;
	double price;
	int qty;
    String author;

    Identification author1=new Identification("Kali","kali@gmail.com",'f');
	Identification author2=new Identification("MrJoy","Joy@qq.com",'m');//String name,String email,char gender

  public Book() {}
  public Book(String name,double price,int qty)
  {this.name=name;this.price=price;this.qty=qty;} 


 public String getName() {return this.name;}
 
     public String getAuthor() 
    {  
	if (this.name.equals("HappyStory")){return author1.getName();}
	if (this.name.equals("MathBook"))  {return author2.getName();}
	else return "got NAME error";
    }
     public void setName(String name) {this.name=name;}
     public double getPrice(){return this.price;}
     public void   setPrice(double price){this.price=price;}
     public double getQty() {return this.qty;}
     public void   setQty(int qty) {this.qty=qty;}
     
     String toString(String name,char gender,String email) 
     {
    	 return name+" ("+gender+") at "+email;
     }
    
}