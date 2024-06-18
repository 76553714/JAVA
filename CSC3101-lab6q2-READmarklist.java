package lab6q2;
import java.io.*;

public class READmarklist
{
	public static void main(String args[]) 
 {
		String str;
	try {
		File marklist = new File("src/lab6q2/CSC3101-lab6q2-makrlist.txt");
		File resultlist=new File("src/lab6q2/CSC3101-lab6q2-resultlist.txt");
		
		if(!marklist.exists()) 
			{
			System.out.println("Can not run because there is no txt file!But don't worry:JOY has made for u,so please write marks in the txt:"+marklist);
			marklist.createNewFile();
			}
		else if(!resultlist.exists()) 
		{
		System.out.println("Can not run because there is no txt so JOY has made a "+resultlist+" for you,you can run again");
		resultlist.createNewFile();
		}
		else 
		{
		System.out.println("All directory and file are exist!Now Start to normally run!Welcome to JOY project!");}
		marklist.createNewFile();
		}
	catch(IOException e) {System.out.println("WARNING! Detected IO Exception:\n");e.printStackTrace();}
	catch(Exception error)
	{   
		System.out.println("other errors happened when judged file,Please call JOY to solve");
		error.printStackTrace();
	}
	finally {System.out.print("NOW END Reading");}
	//NOW start to read and writer the result of UPM students(such as JOY)' mark
	try {
		
		
        BufferedReader in = new BufferedReader(new FileReader("src/lab6q2/CSC3101-lab6q2-makrlist"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/lab6q2/CSC3101-lab6q2-resultlist.txt"));
        
        System.out.println("\nTestOutput:");
        while(     (          str = in.readLine()      ) != null      ) 
        
        {
            String name;//1
             String matric;//2
              String first;//3
               String labtest;//4
                String quiz;//5
                 String project;//6
                  String finalexam;//7
            //method 1 : use indexOf
            name=str.substring(0,str.indexOf("matric:"));//1
             matric=str.substring(str.indexOf("matric:"),str.indexOf("first:"));
              first=str.substring(str.indexOf("first:")+6,str.indexOf("labtest:"));//3
               labtest=str.substring(str.indexOf("labtest:")+8,str.indexOf("quiz:"));
                quiz=str.substring(str.indexOf("quiz:")+5,str.indexOf("project:"));//5
                 project=str.substring(str.indexOf("project:")+8,str.indexOf("finalexam:"));
                  finalexam=str.substring(str.indexOf("finalexam:")+10);//7
            
              double vfirst=Double.parseDouble(first);
               double vlabtest=Double.parseDouble(labtest);
                double vquiz=Double.parseDouble(quiz);
                 double vproject=Double.parseDouble(project);
                  double vfinalexam=Double.parseDouble(finalexam);
              
            System.out.println(name);
            System.out.println(matric);
            System.out.println(vfirst);
            System.out.println(vlabtest);
            System.out.println(vquiz);
            System.out.println(vproject);
            System.out.println(vfinalexam);
             Double total = vfirst*0.15+vlabtest*0.20+vquiz*0.15+vproject*0.1+vfinalexam*0.4;
           
              String textgrade=String.valueOf(total);
             String grade;
            
            if (total>75||total==75)
        	   { grade=" A ";}
           else  { grade=" F ";}
         
           out.write(matric);out.write(textgrade);out.write(grade+"\n");
            //method2 : use split
          
          // String [] allinfo =  str.split(" ");
          // System.out.print(allinfo[0]);
           //
        }
        if((str=in.readLine())==null) {System.out.print("Finished Reading!");}
       
        out.flush();
         in.close();
          out.close();
    } 
	 catch (IOException e) {System.out.println("Detected IO exception when output result!Please contact JOY to solve");}
	catch(Exception e) {System.out.println("Detected Other Exception!Please contact JOY");e.printStackTrace();}
   finally {System.out.println("Output END!");}
 }
	
	
	
	
}
