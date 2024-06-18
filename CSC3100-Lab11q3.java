package lab;
import java.util.Scanner;
import java.lang.Math;

public class Lab11q3
{
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);
	 String[]name=new String[5]; 
	 int []test1=new int[5];
	 int []test2=new int[5];
	 int []test3=new int[5];
	 int []test4=new int[5];
	 
	 for (int i =1;i<=5;i++) 
	 {      System.out.print("Input Name of Student "+i);	
	         name[i-1]=input.next();
	        System.out.print("Input Score of Student "+i+" in Test 1");
	        test1[i-1]=input.nextInt();
	        if(test1[i-1]<0||test1[i-1]>100) {System.out.print("Invalid input!Now Exit.Score must >0 and <=100");System.exit(0);}
	 
	        System.out.print("Input Score of Student "+i+" in Test 2");
	        test2[i-1]=input.nextInt();
	        if(test2[i-1]<0||test2[i-1]>100) {System.out.print("Invalid input!Now Exit.Score must >0 and <=100");System.exit(0);}
	        
	        System.out.print("Input Score of Student "+i+" in Test 3");
	        test3[i-1]=input.nextInt();
	        if(test3[i-1]<0||test3[i-1]>100) {System.out.print("Invalid input!Now Exit.Score must >0 and <=100");System.exit(0);}
	        
	        System.out.print("Input Score of Student "+i+" in Test 4");
	        test4[i-1]=input.nextInt();
	        if(test4[i-1]<0||test4[i-1]>100) {System.out.print("Invalid input!Now Exit.Score must >0 and <=100");System.exit(0);}

	 }
		String []grade=new String [5];
		for (int n=1;n<=5;n++) 
		{
			grade[n-1]=calc(test1[n-1],test2[n-1],test3[n-1],test4[n-1]);	
			System.out.print("\n Student"+n+" Name:"+name[n-1]+" Grade: "+grade[n-1]);
		}
 }
/*90-100 A
80-89 B
70-79 C
60-69 D
Below 60 F*/
public static String calc(int test1,int test2,int test3,int test4) 
 {  String grade="?";
	int average = (test1+test2+test3+test4)/4;
	if(average>=90&&average<=100)
		grade="A  average:"+average;
	else if(average>=80&&average<=89)
		grade="B  average:"+average;
	else if(average>=70&&average<=79)
		grade="C  average:"+average;
	else if(average>=60&&average<=69)
		grade="D  average:"+average;
	else if(average<60)
		grade="F  average:"+average;
	
	 
	return grade;
 }

    

}//class
