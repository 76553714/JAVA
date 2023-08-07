package lab3q3;

public class Manager extends Employee
{
  double allowance;

   Manager(){}
   Manager(String name,String add,String phone,String mail,String num,double salary,double allowance)
   {this.name=name;this.address=add;this.phone=phone;this.mail=mail;this.number=num;this.basicsalary=salary;this.allowance=allowance;}
    
   void   setallowance(double allow){this.allowance=allow;}
   double getallowance() {return this.allowance;}
   
   public String toString() {return "The Manager "+this.name+" (employee number "+this.number+") has a salary of "+this.basicsalary;}
   public String showallowance() {return "The manager "+this.name+" also has an allowance of "+this.allowance;}
}
