package lab3q1;

public class Undergraduate extends Student{

     String level;
     

   public Undergraduate() {}
   public Undergraduate(int matric,String name,double gpa,String level,String email) //reloading of Constructor
   {this.matric=matric;this.name=name;this.gpa=gpa;this.level=level;this.email=email;}

  public String toString () 
  {return"Undergtaduate Student \n Matric: "+this.getmatric()+"\n Name: "+this.getname()+"\n GPA: "+this.getgpa()+"\n Classification: "+this.getlevel();}
  
  public  void  setlevel(String level) {this.level=level;}
  public String getlevel() {return this.level;}

}
