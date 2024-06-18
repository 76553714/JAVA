package lab;
import java.util.Scanner;
import java.lang.Math;
public class Lab12q1
{
public static void main(String[] args)
{
	int [][]hours = new int [7][7];	
Scanner input = new Scanner(System.in);
	for (int i = 0; i<7;i++) {
		
	System.out.print("input the working time on Sunday of Employee " +(i+1));
	hours [i][0]=input.nextInt();
	if (hours[i][0]<0||hours[i][0]>24) {error();}
	
	System.out.print("input the working time on Monday of Employee " +(i+1));
	hours [i][1]=input.nextInt();
	if (hours[i][1]<0||hours[i][1]>24) {error();}
	
	System.out.print("input the working time on Tuesday of Employee " +(i+1));
	hours [i][2]=input.nextInt();
	if (hours[i][2]<0||hours[i][2]>24) {error();}
	
	System.out.print("input the working time on Wednesday of Employee " +(i+1));
	hours [i][3]=input.nextInt();
	if (hours[i][3]<0||hours[i][3]>24) {error();}
	
	System.out.print("input the working time on Thursday of Employee " +(i+1));
	hours [i][4]=input.nextInt();
	if (hours[i][4]<0||hours[i][4]>24) {error();}
	
	System.out.print("input the working time on Friday of Employee " +(i+1));
	hours [i][5]=input.nextInt();
	if (hours[i][5]<0||hours[i][5]>24) {error();}
	
	System.out.print("input the working time on Saturday of Employee " +(i+1));
	hours [i][6]=input.nextInt();
	if (hours[i][6]<0||hours[i][6]>24) {error();}
	}
	
	for (int m =0;m<7;m++) 
	      {
	      int [] total=new int [7];
	      total[m]= hours[m][0]+hours[m][1]+hours[m][2]+hours[m][3]+hours[m][4]+hours[m][5]+hours[m][6];
	      System.out.println("Total working time of Employee " +(m+1)+" is :" +total[m]);
		  }
	
	}
public static void error() {
	System.out.print("Error!Time can't Be Negative and can not more than 24!now Exit");
	System.exit(0);
}


}
