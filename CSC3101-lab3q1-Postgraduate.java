package lab3q1;

public class Postgraduate extends Student{

String Thesis;
//�о����ģ� �� �� GPA ���� �ʼ�
 public Postgraduate() {}
 public Postgraduate(int matric,String name, double gpa , String title,String email) 
 {this.matric=matric;this.name=name;this.gpa=gpa;this.Thesis=title;this.email=email;}//�о������췽��������


 public String toString () 
 {return"Postgraduate Student \n MATRIC: "+this.getmatric()+"\n NAME: "+this.getname()+"\n GPA: "+this.getgpa()+"\n THESIS:"+this.getThesis();}

 public void setThesis(String thesis) {this.Thesis=thesis;}
 public String getThesis() {return this.Thesis;}
 
}
