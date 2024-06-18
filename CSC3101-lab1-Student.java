 package lab1;
 public class Student 
{
       int   idStudent;
        String name  ;
		String major ;
		String classification;
		static Student storage[]=new Student[4];
	
	/*constuctor 1*/public Student(int idStudent, String name, String major, String classification) 
	{ 
	  this.idStudent=idStudent;
	  this.name=name;
	  this.classification=classification;
	  this.major=major; 
	  System.out.println("test output when initialize :" + idStudent+name+classification+major);//test output when initialize
	}	
		
	/*constuctor 2*/public Student(int idStudent, String name, String major) 
	{ 
	  this.idStudent=idStudent;
	  this.name=name;
	  this.major=major; 
	  this.classification=" ";
	}
	
	/*constuctor 3*/public Student() 
	{ 
	  this.idStudent=0;
	  this.name=" ";
	  this.classification=" ";
	  this.major=" "; 
	}
	
	 public Student(Student getter) {}

	public static void main(String[] args) 
	 {
	 Student student1=new Student(160932,"Ghazali Ali","Science (Statistic)","Muda");
	 Student student2=new Student(167432,"Abdul Rahman","Engineering",       "Muda");
	 Student student3=new Student(174123,"Abdul Majid" , "Forestry"  ,       "Muda");
	 Student student4=new Student(158911,"Hoo Yee An ","Computer Science","Bongsu" );
		
		
		
	
	  Student [] studentinfo = new Student[4];
	  studentinfo[0]=student1;
	  studentinfo[1]=student2;
	  studentinfo[2]=student3;
	  studentinfo[3]=student4;
	   setter(studentinfo);
	   
	   Student [] gettertest =new Student[4];
           gettertest[0]=getter();
           
           System.out.print("||Gettertest name:"+gettertest[0].name+"  ||Gettertest major: "+gettertest[0].major+"||Gettertest classification: "+gettertest[0].classification);//getter test output
	   
    
     
	 System.exit(0);//
	 }

	 
      public static void setter(Student[] students) 
          { 
    	  storage =students.clone();//
    	  System.out.println("storage test output:"+storage[0].name);//test output
    	  System.out.println("storage test output:"+storage[2].major);//test output
    	  
    	  }
      
    
    public static Student getter() {return storage[0];}
}
