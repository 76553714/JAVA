package lab3q3;

public class Employee extends Person
{
  String number;
  double basicsalary;
   
   Employee (){}
   Employee (String name,String add,String phone,String mail,String num,double salary)
   {this.name=name;this.address=add;this.phone=phone;this.mail=mail;this.number=num;this.basicsalary=salary;}
  
  void setnumber     (String number) {this.number=number;}
  void setbasicsalary(double  salary  ) {this.basicsalary=salary;}
   
   String getnumber  () {return  this.number ; }
   double getbasicsalary() {return  this.basicsalary;}
}
