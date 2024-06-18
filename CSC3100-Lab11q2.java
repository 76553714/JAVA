package lab;
import java.util.Scanner;
import java.lang.Math;//

public class Lab11q2
{
public static void main(String[] args)
{
int list[]=new int[10];
Scanner input = new Scanner(System.in);
System.out.print("Input the number1");
list[0]=input.nextInt();
System.out.print("Input the number2");
list[1]=input.nextInt();
System.out.print("Input the number3");
list[2]=input.nextInt();
System.out.print("Input the number4");
list[3]=input.nextInt();
System.out.print("Input the number5");
list[4]=input.nextInt();
System.out.print("Input the number6");
list[5]=input.nextInt();
System.out.print("Input the number7");
list[6]=input.nextInt();
System.out.print("Input the number8");
list[7]=input.nextInt();
System.out.print("Input the number9");
list[8]=input.nextInt();
System.out.print("Input the number10");
list[9]=input.nextInt();

System.arraycopy(eliminateDuplicate(list), 0, list, 0, 0);
for(int num=0;num<10;num++) {
System.out.print(" "+list[num]);
}
}//main

     public static int[] eliminateDuplicate(int[] list)
   {     
    	 int[] temp=new int [10];
        
         int i =0;
         int n=0;
        	 for (;i<=9;i++) 
        	 {   for( n =0;n<=9;n++)
                {
        		 if (list[i]==temp[n]) {break ;}    
        		 else if (list[i]!=temp[n]){
        			 if (n>=9&&temp[n]!=temp[n-1]) {temp[n]=list[i];}
        			                      }    
        		 
        	    }
        	 } 
        		 
        	
        	 return temp;        
  }
    	
   

}//class
