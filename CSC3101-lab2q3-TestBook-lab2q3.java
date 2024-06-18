package lab2q3;
public class TestBook extends Book{
	public TestBook() {}
	
	public static void main(String[] args) 
	{
		  TestBook launch = new TestBook();
		staticlaunch(launch);
          System.out.println("Back to main method successfully!NOW END Normally (with code 888)\n");
            System.exit(888);
	}	
	public static void staticlaunch(TestBook go) 
	{ System.out.println("Static launched successfully! \n :)   Every book is OK\nNow ready to convert to dynamic Launch");go.dynamiclaunch();	}
	
	public void dynamiclaunch() 
	  {   
	   System.out.println("Dynamic launched successfully \n");
	   
	    Identification author1=new Identification("Kali","kali@gmail.com",'f');
		Identification author2=new Identification("MrJoy","Joy@qq.com",'m');//String name,String email,char gender
		 
		 Book book1 =new Book();
		 Book book2 =new Book();
	  
	    book1.setName("HappyStory");book1.setPrice(50);book1.setQty(5000);
	    book2.setName("MathBook");book2.setPrice(90);book2.setQty(4850);
	      
	      System.out.println("Successfully initialized all variable!\n");
	      
		System.out.println  ("Ready to output Information of Book1 and its author");
	     System.out.println  ("Name of book1:"+book1.getName());	
		  System.out.println("Price of book1: " +book1.getPrice());
		   System.out.println("Remaning Quantity of the book: "+book1.getQty());
		  	System.out.println("Author details of book1: "+toString(author1.getName(),author1.getGender(),author1.getEmail()));
		
	System.out.println("\n");
		
		System.out.println  ("Ready to output Information of Book2 and its author");
	     System.out.println  ("Name of book2:"+book2.getName());	
		  System.out.println("Price of book2: " +book2.getPrice());
		   System.out.println("Remaning Quantity of the book: "+book2.getQty());
		    System.out.println("Author details of book1: "+toString(author2.getName(),author2.getGender(),author2.getEmail()));
	}

}
