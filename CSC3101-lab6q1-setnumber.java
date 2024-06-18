package lab6q1;
import java.util.Scanner;
import java.io.*;
public class setnumber 
{
	public  static void main(String args[]) 
	{
		try 
		{	
			File numbertxt = new File("D:\\LAB6/testFolderName/numberlist.txt");
			File parentdir = numbertxt.getParentFile();
			
			if(!parentdir.exists()) 
				{	
				System.out.println("The parent directory does not exit But now we are make one for you!");
				 parentdir.mkdirs();
				System.out.println("Successfully to make directory!Now we can normally run!");
				}
			else {System.out.print("All directory and file are exist! Now Start to normally run!");}
			numbertxt.createNewFile();
				
			
			PrintWriter output =new PrintWriter (numbertxt) ;
			output.printf("-----* N u m b e r    L i s t *-----");
			
			Scanner input =new Scanner(System.in);
			for(int i=0;i<2;i++) 
			{
			  System.out.println("\nInput the name that you want to store(if u want to stop,please input 'xxx'):");
			   String name = input.next();
				if(name.equals("xxx"))
					{System.out.print("OK!now STOP to store!");break;}
				else{
					   i=0;
					  output.printf("\nname:"+name);
					System.out.print("\n Successfully to store the name in "+numbertxt);
					System.out.print("\n Now please input the phone number of "+name);
				String phonenumber=input.next();
				
				output.printf("   phone:"+phonenumber);
					}
			}
			 input.close();
			 output.close();

		}
		catch(IOException IOerror) 
		{
			System.out.println("This is an Input/Output error!The IOerror information are as follows:");
		    IOerror.printStackTrace();
		}
		catch(Exception error)
		{   
			System.out.println("Other error!");
			error.printStackTrace();
		}
		finally
		{ 
			System.out.println("\nFinally END!");
		}
		
	  
	  
	 
	}
}


