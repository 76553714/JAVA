package lab;
import java.io.IOException;
import java.util.Scanner;
public class Lab5Q1 
{

	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter the Skill level");
		Scanner inputin = new Scanner(System.in);
		 short SkillLevel = inputin.nextShort();
		 double payrate = 0;
		 double weeklycost = 0;
		 short insuranceoption = 0;
		 
	     double worktime =    0   ;
	     double extremetime = 0   ;
	     double regulartime = 0   ;
	     double regularsalary=0   ;
	     double overtimepay = 0   ;
	     double finalsalary = 0   ;
	     double totalsalary = 0   ;
	     
		switch(SkillLevel){
		 case 1 : payrate=17.00;
		 break;
		 case 2 : payrate=20.00; 
		 break;
		 case 3 : payrate=22.00; 
		 break;
		 default : System.out.print("Invalid SkilLevel!");
		 return;
		                 }
		
		if (SkillLevel>1)
		{
		System.out.println("Enter the Insurance option,If you don't have,please enter 0");
		 insuranceoption = inputin.nextShort();
		  switch(insuranceoption)   
		      {
		        case 0 : weeklycost=0.00;
		        break;
		        case 1 : weeklycost=32.5;
		        break;
		        case 2 : weeklycost =20.00;
		        break;
		        case 3 : weeklycost =10.00;
		        break;
		        default: System.out.print("Invalid Option!"); 
		        return;
		      }
		}
		else weeklycost=0;	
		 
		 
		System.out.println("Enter the work time:");
			worktime = inputin.nextDouble();
			 if (worktime>0) 
		 {
				  if (worktime>= 40) 
				    {
				      extremetime = worktime - 40 ;
				      regularsalary= 40 * payrate;	
			          overtimepay = extremetime*1.5*payrate;
				    }
			 else {
					 regulartime = worktime;
					  extremetime = 0;
				       regularsalary=worktime*payrate;
				       overtimepay=0;
			      }
		totalsalary = overtimepay +regularsalary;
	    finalsalary= totalsalary - weeklycost;
				if (finalsalary <0) 
			    {
					System.out.println("error!salary can not be negative");
			 		
		        }
				else {
					 System.out.println("worktime:"+worktime); 
						System.out.println("payrate:"+payrate);  
						System.out.println("regularsalary:"+regularsalary);  
						System.out.println("overtimepay:"+overtimepay);  
						System.out.println("totalsalary:"+totalsalary);  
						System.out.println("finalsalary:"+finalsalary);  
			      	 }
	   

	      }
			 
			 
			 
			 
	else System.out.println("INVALID!Time Must be positive");
		

			   

}

		
		
	}


