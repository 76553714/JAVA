package Lab8;
import java.io.*;
public class lab8q2 
{
 public static void main(String args[]) throws Exception
 {
	 String s;
	 File INfile=new File("src/Lab8/q2in.dat");
	 File OUTfile=new File("src/Lab8/q2out.txt");
	
	if(INfile.exists()&&OUTfile.exists()) 
	{System.out.println("File has already exist,no need to create more");}
	else{
		  BufferedReader bfin=new BufferedReader(new FileReader("src/lab8/q2in.txt"));
		
		 
		 FileOutputStream fout=new FileOutputStream("src/Lab8/q2out.txt",false);
		  DataOutputStream dtout=new DataOutputStream(fout);
		 
			 while((s=bfin.readLine())!=null) 
			 {
				System.out.println(s);
				dtout.write((s+"\n").getBytes());
			 }
		  
			 if((s=bfin.readLine())==null)
				bfin.close();
				dtout.flush();dtout.close();fout.flush();fout.close();
				 System.out.print("Finished Read,Over!");	
	}
 }
}
