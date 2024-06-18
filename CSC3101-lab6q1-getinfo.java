package lab6q1;//v2
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
  public class getinfo{
	 public static void main(String[] args) throws IOException {
	System.out.print("input name or number u want to find");
	  Scanner input =new Scanner(System.in);
	 String thing=input.next();
    File ctoFile = new File("D:\\\\LAB6/Joy/numberlist.txt");
       InputStreamReader rdCto = new InputStreamReader(new FileInputStream(ctoFile));
       BufferedReader bfReader = new BufferedReader(rdCto);
    String txtline = null;
    
    boolean foundORnot=false;
    while ((txtline = bfReader.readLine()) != null) 
    {
    
    	if(txtline.contains(thing))
    	{ System.out.println("here is the information that you are finding: \n"+txtline);foundORnot=true;}
    	else {foundORnot=false;}
    	
    }
    if((txtline = bfReader.readLine()) == null) {
    	
    if (foundORnot==false) {System.out.print("NOT FOUND!NOW END");}
     else {System.out.print("Successfully found and END !");}
    }
    bfReader.close();
  }
}
