package lab;
import java.util.Scanner;
import java.lang.Math;

public class Lab13
{
public static void main(String[] args)
{
	String[][]capital=new String [13][2];
	capital[0][0]="Perlis";      capital[0][1]="Kangar";
	capital[1][0]="Kedah";       capital[1][1]="Alor Setar";
	capital[2][0]="Pulau Pinang";capital[2][1]="Georgetown";
	capital[3][0]="Perak";       capital[3][1]="Ipoh";
	capital[4][0]="Selangor";    capital[4][1]="Shah Alam";//5
	capital[5][0]="Negeri Sembilan";capital[5][1]="Seremban";
	capital[6][0]="Melaka";      capital[6][1]="Bandar Melaka";
	capital[7][0]="Johor";       capital[7][1]="Johor Bahru";
	capital[8][0]="Pahang";      capital[8][1]="Kuantan";
	capital[9][0]="Terengganu";  capital[9][1]="Kuala Terengganu";	
	capital[10][0]="Kelantan";   capital[10][1]="Kota Bharu";
	capital[11][0]="Sarawak";    capital[11][1]="Kuching";
	capital[12][0]="Sabah";      capital[12][1]="Kota Kinabalu";
	
	
	short mark = 0;
	Scanner input = new Scanner(System.in);
	
	for (int i=0;i<13;i++) {System.out.println("What is the capital of "+capital[i][0]+" ?(tips:Capital letter or not are all OK)");
	                          
	                           if (input.nextLine().equalsIgnoreCase(capital[i][1])) 
	                           {System.out.println("Yes you are correct!");mark++;}
	                           else {System.out.print("× Wrong!"+"The correct Answer is "+capital[i][1]+"\n");}
	                       }
System.out.print("All Questions Finished!Your correct count is : "+mark);
input.close();System.exit(0);
}
}
