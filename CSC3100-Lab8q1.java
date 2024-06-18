package lab;
import java.util.Scanner;
import java.io.*;
public class Lab8q1
{	public static void main(String[] args) throws Exception {
		
	File inputmarks = new java.io.File("E:\\javatest\\marks.txt");	
		 if (!inputmarks.exists()) 
		 {	System.out.print("marks.txt has not been found"); System.exit(0); }	 
         Scanner input = new Scanner(new File("E:\\javatest\\marks.txt") );  
		 File outputmarks = new java.io.File("E:\\javatest\\outputmarks.txt");	
		 
		 PrintWriter output=new PrintWriter(outputmarks);	
	while (input.hasNext()) {
		
			
	String matric =input.next();
	String name  = input.next();
	double score1   = input.nextInt();
	double score2   = input.nextInt();
	double score3   = input.nextInt();
	double score4   = input.nextInt();
	double score5   = input.nextInt();	
	double average=0;//Average score
	
  average = (score1+score2+score3+score4+score5)/5;	
  output.print("\n"+matric);
	 
	output.print(" "+name);
	 
	  output.print(" "+average+" ");
 
	if (average>=90&&average<=100) {
		output.print(" A"); }
  else if (average>=80&&average<90) {
	  output.print(" B"); 		}	
  else if (average>=70&&average<80) {
	  output.println(" C"); 
	}
  else if (average>=60&&average<70) {
	  output.print(" D"); }
  else if (average>=0&&average<60) {
	  output.print(" F");	}	
                          } //while	
	output.close();
System.out.print("Finished");
 }
 
}


