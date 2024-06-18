package lab2;
import java.util.*;
//version:Bug Fixed 9
//IF STOP,Please press "Continue"
public class Course {
	private String name;   
	private int numberOfStudents;
	  Scanner input = new Scanner(System.in);
	private String students[]=new String[100];
	   static    String [] c1=new String[100];
	    static   String [] c2=new String[100];
	     static  String [] c3=new String[100];
	
    static int c1number=0;
    static int c2number=0;
    static int c3number=0;

 public Course(String name) {this.name=name;}
//public Course(String name,String amount) {this.name=name;this.numberOfStudents=numberOfStudents;}

	public static void statictest(Course s) throws Exception{ //convert to non-static
	      s.TestCourse();
	      
	   }
	   
	public void TestCourse() throws Exception 
	   {    for(int i=0;i<100;i++) {if (students[i]==null) students[i]=" ";}
		  for(int i=0;i<100;i++) {if (c1[i]==null) c1[i]=" ";}
		  for(int i=0;i<100;i++) {if (c2[i]==null) c2[i]=" ";}
		  for(int i=0;i<100;i++) {if (c3[i]==null) c3[i]=" ";}
		   Course course1 =new Course("PROGRAMMING");
		   Course course3 =new Course("DATABASE");
		   Course course2 =new Course("OOP"); 
		    addStudent("Fatimah Ahmad");
		    addStudent("Sarah Goh");
		    addStudent("BALA");
		    addStudent("Grim N");
		    addStudent("John Smith");
		 input.close();
		  System.out.println("Number ofstudents in Programming II course : "+course1.getNumberOfStudents()); course1.getName();
	   }
		
	  public static void main(String[] args) throws Exception
		{ 
		    Course test=new Course("test");
			statictest(test);
			System.out.println("END");
		}
	   

	  public void addStudent(String student)   throws Exception
	  {
		 String YESORNO ;
	      
		  if (student.equals("")) {System.out.println("Can not be empty!now exit");System.exit(0);}
		 
		 int position;
		  for ( position = 0;position<100;position++) 
		  {
			if (students[position]==" ") {students[position]=student;break;}
			 else if (position == 100&&students[100]!=" ")
				{System.out.println("Array of Students has been filled,now exit");System.exit(0);}
		   }
			  
		  System.out.println("Do you want to register the class ‘Programming’?"+"for student"+student+" (Y for YES/N or other words for NO )");
		  YESORNO =input.next();	 
		
		  if(YESORNO.equals("Y"))
		   {
			{addclass(1,student);System.out.println("Register Successfully for Programming");}   
		   } 
		  
		
		  System.out.println("Do you want to register the class ‘DATABASE’?"+"for student"+student+" (Y for YES/N or other words for NO )");
		  YESORNO =input.next();	 
		 
		  if(YESORNO.equals("Y"))
		   {
			{c2number++;addclass(2,student);System.out.println("Register Successfully for DATABASE");}   
		   }
		  

		  System.out.println("Do you want to register the class ‘OOP’?"+"for student"+student+" (Y for YES/N or other words for NO )");
		  YESORNO =input.next();	 
		   
		  if(YESORNO.equals("Y"))
		   {
			{c3number++;addclass(3,student);System.out.println("Register Successfully for OOP");}   
		   }
		  
		  System.out.println("Student information has been Added Successfully in Position "+position);
		  
		
	  }
	   
	  public void addclass(int classnumber,String Studentname) 
	  {    int C1position;
	  
		  if(classnumber==1) 
		 {
			  for (C1position = 0;C1position<100;C1position++) 
		  {
			if (C1position == 100&&!c1[C1position].equals(" ") )
				{System.out.println("no quota for this class,now exit");}
			
			if(c1[C1position].equals(" ")) {c1[C1position]=Studentname;System.out.println("Successful-1");c1number++;break;	 }
	      }
		 }
		  
		  
		  int C2position;
		  if(classnumber==2) 
			 {
				  for (C2position = 0;C2position<100;C2position++) 
			  {
				if (C2position == 100&&!c2[C2position].equals(" ") )
					{System.out.println("no quota for this class,now exit");}
				
				if(c2[C2position].equals(" ")) {c2[C2position]=Studentname;System.out.println(" Successful-2");	c2number++;break;}
		      }
			 }
			   
			  
			  int C3position;
			 if(classnumber==3) 
				 {
					  for (C3position = 0;C3position<100;C3position++) 
				  {
					if (C3position == 100&&!c3[C3position].equals(" ") )
						{System.out.println("no quota for this class,now exit");}
					
					if(c3[C3position].equals(" ")) {c3[C3position]=Studentname;System.out.println(" Successful-3");c3number++;break;	}
			      }
				 }  

	}
			  
    public int getNumberOfStudents()
    {
    	switch(this.name) 
    	{
    	case "PROGRAMMING":return c1number;
    	case "DATABASE":return c2number;
    	case "OOP":return c3number;
    		

    	default:return 0;
    	}
    }	

 public void getName() 
 {
	if (this.name=="PROGRAMMING")  
	{
		for(int i =0;i<100;i++) 
		{
			if (!c1[i].equals(" ")) {System.out.println(i+"."+c1[i]);}
			
		}
	}	
 } 
}
