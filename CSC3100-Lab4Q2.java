package lab;
import java.util.Scanner;
public class Lab4Q2 {

	public static void main(String[] args) {
		Scanner shuru = new Scanner(System.in);
		
	System.out.println("Input package type");
		String taocan = shuru.nextLine();
		if(taocan.equals("Gold")||taocan.equals("Platinum")||taocan.equals("Not found!Please Retry!"))
{			
		System.out.println("Input the number of minutes that were used");
		 int totaltime = shuru.nextInt();
		 double  price  =  0;
		 int    extratime  =  0;
		 double    planfee  =  0;
	     int    freetime  =  0;
	   	 double extrafee  =  0;
	     
		if(taocan.equals("Gold")) 
		  {
		   	     freetime = totaltime;
			     planfee = 80;
			     
		             if(totaltime<=450)            {
		                           price = 80;
		                                       }
                         else {
		                 freetime = 450;
		     			 planfee = 80;
		        	     extrafee=(totaltime - 450)*0.4;
		        	     price = 80 + extrafee;
		        	      extratime = totaltime - freetime;
	                          }
		                
		  }
		  
		if(taocan.equals("Platinum")) 
				  {
				     	freetime = totaltime;
					    planfee = 120;
				        if(totaltime<=900)     {
				        	 price = 120;
				                           }
				          else   {
				        	     freetime = 900;
							     planfee = 120;
				        	     extrafee=(totaltime - 900)*0.2;
				        	     price =     120 + extrafee;
				        	     extratime =   totaltime - freetime;
				                 }
				   
				  }	
		
	     System.out.println("Package: "+ taocan);
         System.out.println(freetime+" minutes: "+ "RM" + planfee);
         System.out.println(extratime+" minutes: "+ " RM" + extrafee);
         System.out.println("Total charges:RM"+price);
		         
		
		     if (taocan.equals("Titanium"))   {
			 System.out.println("Package: "+ taocan);
	         System.out.println(totaltime+" minutes: "+ "RM160.00" );
	         System.out.println("Total charges: RM"+price);
		                                      }
  
}
		else {
			    System.out.println("Not found!Please Retry!");
             }
	}

		  }
