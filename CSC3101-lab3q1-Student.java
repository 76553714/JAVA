package lab3q1;

public class Student {

	int matric;
	String name;
	String email; 
	double gpa;


	public Student() {}
	public Student(int matric,String name,String email,double gpa) //方法的重载
	
	{this.matric=matric;this.name=name;this.email=email;this.gpa=gpa;}
	
	public void setmatric(int matric  ) {this.matric=matric;}
	 public void setname( String name  ) {this.name=name;}
	  public void setemail(String email) {this.email=email;}
	   public void setgpa(double gpa) {this.gpa=gpa;}
	
	   public int getmatric() {return this.matric;}
	  public String getname  () {return this.name;}
	 public String getemail () {return this.email;}
    public double getgpa   () {return this.gpa;}
	
	public String toString () {return" Student \n Matric: "+this.getmatric()+"\n name: "+this.getname()+"\n E-mail:"+this.getemail()+"\n GPA: "+this.getgpa();}
	
}



