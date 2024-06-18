package lab5;
import java.util.*;
public class EmployeeException 
{
	 int identification;
	 int age;
     public int errorcode;
     public EmployeeException() {}
	public EmployeeException (int idfct,int age) 
{ 
	 try //1
	 { 
		 if(idfct<0||idfct>999) { throw new NumberFormatException();}
		 else {this.identification=idfct;errorcode+=1;}	 
	 }
	 catch(Exception e1) 
	 {/*e.printStackTrace();*/System.out.print("Identification out of range!");}
	 

	 try//2 
	 { 
		 if(idfct<0||age<0) { throw new IllegalArgumentException();}
		 else {this.identification=idfct;this.age=age;}	 
	 }
	 
	 catch(Exception e1){System.out.println("Age or ID cannot be negative!");errorcode+=1;}
	 // Exception这个东西 是其他Exception的父类, 所以要么就只有Exception，要么其他子类的Exception往后面站
	 //catch(InputMismatchException inpute) {System.out.print("你输入的这是小数1");}

	 
	 
	 finally {System.out.println("\nDone");Employee staff=new Employee(idfct,age);}
	 
}
	 
	
	
	
	public static void main(String args[]) 
	{int i;int a;
	  Scanner lab5input = new Scanner(System.in);	 
	   System.out.print("Input ID(identification)");
	   try{i = lab5input.nextInt();}
	    catch(Exception e3){throw new InputMismatchException("Age must integer value");}
	   System.out.print("Now Input age");
	   try{a = lab5input.nextInt();}
	    catch(Exception e4){throw new InputMismatchException("Age must integer value");}
	   lab5input.close();
	     
			EmployeeException e = new EmployeeException(i,a);
	}
	
	 
}

